import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateTime {
	public static void main(String[] args) {
		//String date = "2024-06-14";
		Calendar cal = Calendar.getInstance();
		
		cal.set(1, 2025);
//		cal.set(2, 6);
//		cal.set(3, 14);
		System.out.println(cal.get(1));
		
		Date date = cal.getTime();
		System.out.println(date.toString());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("GG/yyyy-MM-dd hh:mm:ss");
		System.out.println(dateFormat.format(date));
		
		
	}
}

