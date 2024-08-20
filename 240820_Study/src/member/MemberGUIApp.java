package member;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Base64.Decoder;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import member.Member;
import member.Subscribe;

class MainWindow extends JFrame implements ActionListener {
	private List<Member> list = new ArrayList<>();
	private MemberForm form;
	private MemberView view;
	private MemberService service;
	
	public MainWindow() {
		service = new MemberService(new MemberDAO(), new SubscribeDAO(), new Base64DAO());
		
		JTabbedPane tabbedPane = new JTabbedPane();
		form = new MemberForm(this);
		tabbedPane.add("회원 등록", form);
		view = new MemberView(this);
		tabbedPane.add("회원 검색", view);
		tabbedPane.setPreferredSize(new Dimension(500, 500));
		
		add(tabbedPane);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("회원 등록")) {
			
			Member userInput = form.getUserInput();
			
			if(userInput !=null) {
				list.add(userInput);
				int key = service.insert(userInput);
				// TODO : 사용자가 올바른 입력값을 작성했는지 확인하고 알려줘야함.
				if(key == -1) {
					JOptionPane.showMessageDialog(this, "중복된 전화번호가 있어요!");
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "빈 칸을 다 채워주세요!");

			}
			
//			service.insert(userInput.getName(), userInput.getPhoneNumber(),
//					userInput.getSubscribe().getSubscribeType());
			// TODO : 데이터 쓰기 결과 확인 후 알려줘야함.
			// 추가가 안되는 경우 알려줘야함
		} else if (command.equals("검색")) {
			String key = view.getKey();
			// TODO : 사용자가 올바른 입력값을 작성했는지 확인하고 알려줘야함.
			try {
				int index = Integer.parseInt(key);
				
//				Member member = list.get(index);
				Member member = service.findByIdWithNull(index);
				
				if(member !=null) {
					view.display(member);				
				}
				else {
					JOptionPane.showMessageDialog(this, "해당하는 사람이 없어요!");

				}
			} catch (NumberFormatException e2) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "숫자만 입력해주세요!");
			}
			
			// 검색시 프로필 사진까지 띄워주기
			// TODO : 검색 결과가 없는 경우에 알려줘야함.<<
		}
	}
}

class MemberView extends JPanel {
	private JTextField tfKey;
	private JLabel lblName;
	private JLabel lblPhoneNumber;
	private JLabel lblSubscribeType;
	private JLabel lblProfilePic;

	public MemberView(MainWindow mainWindow) {
		// 특정 회원 정보 검색
		JLabel lblKey = new JLabel("회원 번호");
		tfKey = new JTextField(10);
		JButton btnSearch = new JButton("검색");
		btnSearch.addActionListener(mainWindow);
		
		lblName = new JLabel("이름");
		
		lblPhoneNumber = new JLabel("전화번호");
		
		lblSubscribeType = new JLabel("구독형태");
		lblProfilePic = new JLabel(" ");
		
		add(lblKey);
		add(tfKey);
		add(btnSearch);
		add(lblName);
		add(lblPhoneNumber);
		add(lblSubscribeType);
		add(lblProfilePic);
	}
	
	public void display(Member member) {
		lblName.setText(member.getName());
		lblPhoneNumber.setText(member.getPhoneNumber());
		lblSubscribeType.setText(member.getSubscribe().getSubscribeType());
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(member.getData());
		ImageIcon icon = new ImageIcon(decode);
		lblProfilePic.setIcon(icon);
	}

	public String getKey() {
		return tfKey.getText();
	}
}

class MemberForm extends JPanel {
	private JTextField tfName;
	private JTextField tfPhoneNumber;
	private JComboBox<String> cbSubscribeType;

	public MemberForm(MainWindow mainWindow) {
		// 회원 등록하기
		// 이름, 전화번호, 구독형태
		JLabel lblName = new JLabel("이름");
		tfName = new JTextField(10);
		JLabel lblPhoneNumber = new JLabel("전화번호");
		tfPhoneNumber = new JTextField(10);
		JLabel lblSubscribeType = new JLabel("구독형태");
		String[] comboModel = new String[] { "구독", "무료" };
		cbSubscribeType = new JComboBox<>(comboModel);
		
		add(lblName);
		add(tfName);
		add(lblPhoneNumber);
		add(tfPhoneNumber);
		add(lblSubscribeType);
		add(cbSubscribeType);
		
		JButton btnAdd = new JButton("회원 등록");
		btnAdd.addActionListener(mainWindow);
		add(btnAdd);
	}
	
	public Member getUserInput() {
		String name = tfName.getText();
		String phoneNumber = tfPhoneNumber.getText();
		String subscribeType = (String) cbSubscribeType.getSelectedItem();
		if(name.length() !=0 && phoneNumber.length() !=0) {
			return Member.builder()
					.name(name)
					.phoneNumber(phoneNumber)
					.subscribe(new Subscribe(subscribeType))
					.build();	
		}
		else {
			return null;
		}
		
	}
}

public class MemberGUIApp {
	public static void main(String[] args) {
		new MainWindow().setVisible(true);
	}
}
