import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestDataGUIProgram extends JFrame {
	private File currentFile;
	private JTextArea ta;
	
	public TestDataGUIProgram() {
		super("나의 메모장");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnlNorth = new JPanel();
		JButton btnSave = new JButton("파일 저장");
		JButton btnSaveAnother = new JButton("새 이름으로 저장");
		JButton btnLoad = new JButton("파일 열기");
		pnlNorth.add(btnSave);
		pnlNorth.add(btnSaveAnother);
		pnlNorth.add(btnLoad);
		add(pnlNorth, "North");
		
		ta = new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		
		add(scroll);
		
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (currentFile == null) {
					saveNewFile();
				} else {
					writeFile(currentFile, ta.getText());
				}
			}
		});
		
		btnSaveAnother.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveNewFile();
			}
		});
		
		btnLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				
				int result = chooser.showOpenDialog(TestDataGUIProgram.this);
				
				if (result == JFileChooser.APPROVE_OPTION) {
					File file = chooser.getSelectedFile();
					currentFile = file;
					
					String fileContent = readFile(file);
					
					ta.setText(fileContent);
					setTitle(file.getName());
				}
			}
		});
	}
	private void saveNewFile() {
		JFileChooser chooser = new JFileChooser();
		
		int result = chooser.showSaveDialog(TestDataGUIProgram.this);
		
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			currentFile = file;
			
			String text = ta.getText();
			
			writeFile(file, text);
			
			setTitle(file.getName());
		}
	}
	
	private String readFile(File file) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
	
	private void writeFile(File file, String text) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			
			pw.print(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
	
	public static void main(String[] args) {
		new TestDataGUIProgram().setVisible(true);
	}
}



















