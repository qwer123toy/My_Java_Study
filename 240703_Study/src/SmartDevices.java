
abstract class SmartDevices {
	protected String madeIn;
	protected int price;
	public SmartDevices(String madeIn, int price) {
		super();
		this.madeIn = madeIn;
		this.price = price;
	}
	String getMadeIn() {
		return madeIn;
	}
	void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
	}
	
	
}

class SmartPhone extends SmartDevices {
	protected String telecom;
	
	public SmartPhone(String madeIn, int price, String telecom) {
		super(madeIn, price);
		this.telecom = telecom;
	}

	String getTelecom() {
		return telecom;
	}

	void setTelecom(String telecom) {
		this.telecom = telecom;
	}

	public void Calling() {
		System.out.println("통화를 시작합니다. 안되잖아?");
	}

}

class iPhone extends SmartPhone{
	private String modelName;

	
	public iPhone(String madeIn, int price, String telecom, String modelName) {
		super(madeIn, price, telecom);
		this.modelName = modelName;
	}

	String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("이거봐라~ 아이폰이다~");
	}


	
	
}

class iPadWithUsim extends SmartPhone{
	private int displaySize;

	
	public iPadWithUsim(String madeIn, int price, String telecom, int displaySize) {
		super(madeIn, price, telecom);
		this.displaySize = displaySize;
	}

	int getDisplaySize() {
		return displaySize;
	}

	void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("이거봐라~ 아이패드다~");
	}


	
	
}

class iPadWithOutUsim extends SmartPhone{
	private int displaySize;

	

	public iPadWithOutUsim(String madeIn, int price, String telecom, int displaySize) {
		super(madeIn, price, telecom);
		this.displaySize = displaySize;
	}

	int getDisplaySize() {
		return displaySize;
	}

	void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	@Override
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("유심 없어!");
	}

	
	
}

class DialPhone{
	private int dial;

	public DialPhone(int dial) {
		super();
		this.dial = dial;
	}

	int getDial() {
		return dial;
	}

	void setDial(int dial) {
		this.dial = dial;
	}
	public void Calling() {
		// TODO Auto-generated method stub
		System.out.println("누가 이런 싸구려 전화로 전화를 하는가");
	}

	
}