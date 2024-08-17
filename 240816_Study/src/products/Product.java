package products;

// 240816 수업

// lombok.jar를 javaProject(240814 db) 라이브러리에 추가해서 이용
// 어노테이션(@~) 만들기 가능

public class Product {
	private int no;
	private String production;
	private String category;
	private int price;
	public Product(int no, String production, String category, int price) {
		super();
		this.no = no;
		this.production = production;
		this.category = category;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", production=" + production + ", category=" + category + ", price=" + price + "]";
	}
	
}