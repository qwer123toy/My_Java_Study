import java.util.Scanner;

public class RoomsB {
	private int roomsInfo;
	private char roomNumbers;
	private String bedType;
	private String customerName;
	private String realCustomerName;
	private int roomPrice;
	private int bedCount;

	public RoomsB() {
		this.roomsInfo = 0;

	}

	public RoomsB(String bedType, int roomPrice, int bedCount, char roomNumber) {
		this.bedType = bedType;
		this.roomPrice = roomPrice;
		this.roomsInfo = 0;
		this.roomNumbers = roomNumber;
		this.bedCount = bedCount;
		this.realCustomerName = "";
		this.customerName = "";
	}

	public int getRoomsInfo() {
		return roomsInfo;
	}

	public void setRoomsInfo(int roomsInfo) {
		this.roomsInfo = roomsInfo;
	}

	public char getRoomNumbers() {
		return roomNumbers;
	}

	public void setRoomNumbers(char roomNumbers) {
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

}
