
class Can {
	String menu;
	int price;

	public Can(String model, int speed) {
		super();
		this.menu = model;
		this.price = speed;
	}


	public String getMenu() {
		return menu;
	}


	public void setMenu(String menu) {
		this.menu = menu;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void printState() {
		System.out.println("종류 : " + menu);
		System.out.println("가격 : " + price);
	}



}