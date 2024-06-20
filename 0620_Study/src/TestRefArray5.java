import java.util.Arrays;

class VendingMachine {
	Can[] cans;

	public VendingMachine() {
		cans = new Can[] { new Can("콜라", 2000), new Can("사이다", 1800), new Can("환타", 1500) };
	}

	public VendingMachine(Can[] cans) {
		super();
		this.cans = cans;
	}

	public Can[] getCans() {
		return cans;
	}

	public void setCan(Can[] cans) {
		this.cans = cans;
	}

	public void showAllProduct() {

		// System.out.println(Arrays.toString(cans[0]));

	}

	public void printMenus() {
		for (int i = 0; i < cans.length; i++) {
			System.out.println(cans[i].getMenu());
		}
	}

	public void printAllPrice() {
		for (int i = 0; i < cans.length; i++) {
			System.out.println(cans[i].getPrice());
		}
	}

	public int showPrice(String product) {
		for (int i = 0; i < cans.length; i++) {
			if (cans[i].getMenu().equals(product))
				return i;
		}
		return -1;
	}

	public boolean checkIndexRange(int num) {
		if (num >= 0 && num < cans.length)
			return true;
		else
			return false;
	}

	public void process(String name) {
		int index = showPrice(name);
		if (checkIndexRange(index)) {
			showPrice(index);
		} else
			System.out.println("없는 메뉴");
	}

	public void showPrice(int index) {
		System.out.println(cans[index].getPrice());
	}
}

public class TestRefArray5 {
	public static void main(String[] args) {
		Can[] arr = new Can[] { new Can("콜라", 2000), new Can("사이다", 1800), new Can("환타", 1500) };
		VendingMachine vm = new VendingMachine(arr);
//		vm.showPrice("사이다");
//		vm.showPrice(3);
		vm.process("사이다");
		vm.showAllProduct();
	}
}
