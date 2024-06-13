
public class Clock {

	int hour;
	int min;
	int sec;
	// 시계
	// 현재시 현재분 현재초

	public Clock(int hour, int min, int sec) {
		setHour(hour);
		setMin(min);
		setSec(sec);

	}

	public Clock(int hour, int min) {
		this(hour, min, 0);//생성자에서 생성자 메소드 호출, 항상 맨 윗줄이어야 함 
		System.out.println();

	}
	
	public Clock(int hour) {
		this(hour, 0, 0);

	}

	public int getHour() {
		return hour;
	}

	public int getMin() {
		return min;
	}

	public int getSec() {
		return sec;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24)
			this.hour = hour;
	}

	public void setMin(int min) {
		if (min >= 0 && min < 60)
			this.min = min;
	}

	public void setSec(int sec) {
		if (sec >= 0 && sec < 60)
			this.sec = sec;
	}

	public void showClock() {
		System.out.printf("%02d시 %02d분 %02d초", hour, min, sec);
	}

	public static void main(String[] args) {

		Clock c = new Clock(-5, 24);
		c.setHour(14);
		//c.setMin(56);// 필드값 변경
		c.setSec(59);
		c.showClock();
//		System.out.println(c.getHour() + "시");// 변경된 필드값을 가져오기
//		System.out.println(c.getMin() + "분");
//		System.out.println(c.getSec() + "초");
	}
}
