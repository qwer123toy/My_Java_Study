import java.util.Scanner;

public class Rooms {
	int roomsInfo;
	int roomNumbers;
	String bedType;
	String customerName;
	String realCustomerName;
	
	public Rooms() {
		this.roomsInfo = 0;
		
	}
	public Rooms(String bedType) {
		this.bedType = bedType;
		this.roomsInfo = 0;
	}


	public Rooms(int roomsInfo, int roomNumbers, String bedType, String customerName, String realCustomerName) {
		super();
		this.roomsInfo = roomsInfo;
		this.roomNumbers = roomNumbers;
		this.bedType = bedType;
		this.customerName = customerName;
		this.realCustomerName = realCustomerName;
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

	

	// 싱글 베드 : 방번호의 끝자리 수는 홀수이다.
	// 더블 베드 : 방번호의 끝자리 수는 짝수이다.
	// 배열값 0 은 빈방
	// 배열값 1 은 빈방 아님
	// 배열값 2 는 손님이 체크아웃 후 청소직원이 치워야할 방
	// 청소직원이 방을 치운 후에는 배열값을 0으로 바꾸어 다시 사용가능

	// 메소드에 입력된 층수의 빈 방이 몇개 있는지 출력

}
