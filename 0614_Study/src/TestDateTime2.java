import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateTime2 {
	public static void main(String[] args) {
		//String date = "2024-06-14";
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println("5월은 " + Calendar.MAY);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); //일1 월2 화3 수4 목5 금6 토7
		
		
		Calendar tomorrow = Calendar.getInstance();
		tomorrow.add(Calendar.DATE, 1);
		System.out.println(tomorrow.get(Calendar.DATE));
	}
}

