//모든 필드를 초기화 하는 생성자 추가 작성
//각 필드의 getter/ setter 작성
//
public class Can {

	String name;
	int price;
	// 용량
	// 손잡이 유무

	public Can(String name, int price) {
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {

		Can c = new Can("환타",500); // name은 참조형 변수의 기본값인 null로 초기화
		
	}
}
