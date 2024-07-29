import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel mainPanel = new JPanel(new GridLayout(2, 3, 10, 10));
        frame.add(mainPanel);

        for (int i = 1; i <= 6; i++) {
            mainPanel.add(createBallLabel(i));
        }

        frame.setVisible(true);
    }

    private static JLabel createBallLabel(int number) {
        ImageIcon ballIcon = new ImageIcon("path/to/your/ball_image.png");
        JLabel label = new JLabel(ballIcon) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // 숫자 그리기
                g.setColor(Color.WHITE);
                g.setFont(new Font("Serif", Font.BOLD, getWidth() / 2));
                FontMetrics fm = g.getFontMetrics();
                int numberWidth = fm.stringWidth(String.valueOf(number));
                int numberAscent = fm.getAscent();
                g.drawString(String.valueOf(number), (getWidth() - numberWidth) / 2, (getHeight() + numberAscent) / 2 - fm.getDescent());
            }
        };
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setPreferredSize(new Dimension(ballIcon.getIconWidth(), ballIcon.getIconHeight()));
        return label;
    }
}