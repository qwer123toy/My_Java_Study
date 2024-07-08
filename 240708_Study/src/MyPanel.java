import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class MyPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public MyPanel() {
		setPreferredSize(new Dimension(371, 268));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		
		textField = new JTextField();
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MyPanel.class.getResource("/image/\uCD98\uC2DD11.png")));
		add(lblNewLabel_1);

	}

}
