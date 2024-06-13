
//뱅기
/*
 	모델명 : String
 	최대 승객 수 : int
 	모든 필드를 초기화 하는 생성자 작성
 */
public class Plane {

	String model;
	int maxPassenger;

	public Plane(String m, int p) {
		model = m;
		maxPassenger = p;
	}

	public static void main(String[] args) {

		Plane p = new Plane("보잉747", 400);
		System.out.println(p.model);
		System.out.println(p.maxPassenger);

	}
}
