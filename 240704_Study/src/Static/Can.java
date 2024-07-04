package Static;

interface CanType {
	int COLA = 1;
	int CIDAR = 2;
	int FANTA = 3;

	public static String getCanName(int canType) {
		switch (canType) {
		case 1:
			return "콜라";
		case 2:
			return "사이다";
		case 3:
			return "뽱타";
		default:
			return null;
		}
	}
}

public class Can {
	int type;

	public Can(int type) {
		super();
		this.type = type;
	}

	int getType() {
		return type;
	}

	void setType(int type) {
		this.type = type;
	}

	public static void main(String[] args) {
		Can c = new Can(CanType.COLA);
		Can c2 = new Can(1);
		Can c3 = new Can(2);
		String name = CanType.getCanName(c.type);
		System.out.println(name);
	}
}
