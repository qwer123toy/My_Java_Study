
public class Cup {

	int ml;
	boolean son;

	// 용량
	// 손잡이 유무

	// 위 필드를 모두 초기화 할 수 있는 생성자 작성
	public Cup(int cml) {
		ml = cml;
		son = true;
	}

	public Cup(int cml, boolean cSon) {
		ml = cml;
		son = cSon;
	}

	public void printShow() {
		System.out.printf("컵의 용량은 %d, 손잡이 유무 %b\n", ml, son);
	}

	public static void main(String[] args) {
		// 작성한 생성자를 호출해서 용량이 100이고 손잡이가 없는 컵 인스턴스 생성
		Cup c = new Cup(100, false);
		Cup c2 = new Cup(200, true);

		c.printShow();
		c2.printShow();
		
		Cup c3 = new Cup(300);
		Cup c4 = new Cup(400);
		c3.printShow();
		c4.printShow();

	}
}
