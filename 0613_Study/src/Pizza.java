/*
	피자 클래스
	- 상태
	메뉴명
	가격
	제조일자
	요리사 이름
	
	-
	모든 필드를 초기화 하는 생성자
	
	- 행동
	각 필드의 getter / setter 쌍
	모든 필드의 값을 콘솔 출력하는 메소드
	
	---
	위 피자 클래스로 페퍼로니, 치즈, 하와이안 피자 인스턴스를 생성해 테스트해보세요.
 */


/*
 * 1. 인스턴시 생성 시, 필드 초기화를 위해 호출하는 것? 생성자, 필드의 초기화를 위해 자동 생성됨
 * 2. 생성자의 네이밍 규칙? 클래스와 이름이 동일해야됨(자바)
 * 3. 기본 생성자란? 매개 변수(파라미터)를 따로 받지 않는 생성자, 따로 설정하지 않으면 자동으로 생성됨
 * 4. 기본형 타입, 참조형 타입의 기본값은? 기본형(int : 0, double : 0, long : 0L. ..), 참조형(String : Null...) 
 * 5. 기본 생성자가 컴파일러에 의해 자동 생성되지 않는 경우는? 다른 생성자를 따로 작성하였을 때 
 * 6. 파라미터를 달리하는 생성자를 여러 개 정의할 때, 컴파일러가 중복으로 판별하는 규칙은? 파라미터의 타입과 순서를 통해 구분
 * 7. this? 현재 메서드가 속해 있는 객체 자신을 가리키는 참조
 * 8. 생성자 내부에서 자신의 생성자를 호출할 때, 주의해야 할 점? this 구문은 반드시 첫줄에 위치
 * 9. 접근자(getter), 설정자(setter)는 무엇인가요? getter : 멤버 변수(필드)를 반환하는 함수, setter : 멤버 변수를 변경하는 함수
 */

public class Pizza {
	String statement;
	String menuName;
	int price;
	String date;
	String Cooker;

	public Pizza(String statement, String menuName, int price, String date, String cooker) {
		super();
		this.statement = statement;
		this.menuName = menuName;
		this.price = price;
		this.date = date;
		Cooker = cooker;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCooker() {
		return Cooker;
	}

	public void setCooker(String cooker) {
		Cooker = cooker;
	}

	public static void main(String[] args) {
		Pizza p1 = new Pizza("판매중", "페퍼로니 피자", 39000, "2024-06-13", "김덕배");
		Pizza p2 = new Pizza("매진", "치즈 피자", 19000, "2024-06-12", "김대룡");
		Pizza p3 = new Pizza("판매중", "하와이안 피자", 29000, "2024-06-13", "김똑배");
		System.out.println("페퍼로니 피자는 " + p1.getCooker() + "가 만듬");
		System.out.println("치즈 피자는 현재" + p2.getStatement());
		System.out.println("하와이안 피자 가격은 " + p3.getPrice());
		
	}
}
