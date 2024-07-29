import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class LottoDialog extends JDialog{
	public LottoDialog() {
		
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel numChoosePanel = new JPanel();
		getContentPane().add(numChoosePanel, "로또 번호 선택");
		
		
		
		
		
		JPanel resultLottoNumPanel = new JPanel();
		getContentPane().add(resultLottoNumPanel, "로또 번호 추첨 중");
		
		
		
		
		
		
		
		JPanel finalLottoPanel = new JPanel();
		getContentPane().add(finalLottoPanel, "추첨 결과");
		
		
	}
	

}
