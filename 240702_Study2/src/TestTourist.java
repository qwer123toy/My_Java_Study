//한국말로 인사할수 잇는 관광객
// 이름
//인사하기

//영어로 인사 가능
// 이름
//인사하기
class Tourist{
	private String name;

	public Tourist(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("관광객이 인사를 합니다.");
	}
	
}

class KoreanTourist extends Tourist{

	public KoreanTourist(String name) {
		super(name);

	}
	@Override
	public void sayHi() {
		System.out.println("안녕! 내 이름은 " + getName());
	}
	
}

class EnglishTourist extends Tourist{

	public EnglishTourist(String name) {
		super(name);

	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi! My name is " + getName());
	}

	
}


public class TestTourist {
	public static void main(String[] args) {
		Tourist[] tourists = {new KoreanTourist("길동"), new EnglishTourist("Tom"), new KoreanTourist("둘리"), new EnglishTourist("Bred")};
		for(int i=0; i<tourists.length; i++) {
			tourists[i].sayHi();
		}
	}
}
