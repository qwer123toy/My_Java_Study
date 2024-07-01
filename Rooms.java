import java.util.Random;

public class Rooms {
	private int roomsInfo;
	private int roomNumbers;
	private String bedType;
	private String customerName;
	private String realCustomerName;
	private int roomPrice;
	private int bedCount;
	private String realCustomerPhone;
	public Rooms() {
		this.roomsInfo = 0;
		
	}
//	int lost;
//	Random r = new Random();
//	rooms2.getLost()>80// -> 분실물 발생
//	
//	String[] lostThings = {"가방", "지갑", "휴대폰", "옷"};
//	int lostThingRan = r.nextInt(4);// 0 1 2 3
//	String realLost = lostThings[lostThingRan]; //잃어버린 물품
//	roomnumber
//	realCustomerName
//	
//	String[][] LostFind = new String[20][4]; 
//	
//	for(int i=0 i<20 i++)
//		for(int j=0 i<3 i++)
//			if(LostFind[i][j] != null)
//			LostFind[i][0] = LostFind
//			LostFind[i][1] = roomnumber
//			LostFind[i][2] = realCustomerName
//			break;
//	
	public Rooms(String bedType, int roomPrice, int bedCount) {
		this.bedType = bedType;
		this.roomPrice = roomPrice;
		this.roomsInfo = 0;
		this.bedCount = bedCount;
		this.realCustomerName = "";
		this.customerName = "";
		this.realCustomerPhone = "";
		//this.lost = r.nextInt(100)+1;// 1 12 17  85 100
	}


	public Rooms(int roomsInfo, int roomNumbers, String bedType, String customerName, String realCustomerName) {
		super();
		this.roomsInfo = roomsInfo;
		this.roomNumbers = roomNumbers;
		this.bedType = bedType;
		this.customerName = customerName;
		this.realCustomerName = realCustomerName;
	}


	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getBedCount() {
		return bedCount;
	}
	public void setBedCount(int bedCount) {
		this.bedCount = bedCount;
	}
	public String getRealCustomerPhone() {
		return realCustomerPhone;
	}
	public void setRealCustomerPhone(String realCustomerPhone) {
		this.realCustomerPhone = realCustomerPhone;
	}
	public int getRoomsInfo() {
		return roomsInfo;
	}

	public void setRoomsInfo(int roomsInfo) {
		this.roomsInfo = roomsInfo;
	}

	public int getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(int roomNumbers) {
		this.roomNumbers = roomNumbers;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getRealCustomerName() {
		return realCustomerName;
	}

	public void setRealCustomerName(String realCustomerName) {
		this.realCustomerName = realCustomerName;
	}
	

}
