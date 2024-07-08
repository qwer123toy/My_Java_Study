package image;
import javax.swing.JFrame;



public class MyTest2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new MyPanel2());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
