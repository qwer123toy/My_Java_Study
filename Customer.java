import java.util.Random;

public class Customer {
	Random random = new Random();
	private String usersName; //
	private String phoneNumber; //
	// private String realUsersName; //
//	
//	private String realphoneNumber; //
	// private String personalNumber; //
	private boolean member;
	private int money;
	private int useMoney;
	private int[] rooms = new int[] { 0, 0, 0 }; //
	private String[] roomsB = new String[] { "", "", "" }; //재민수정

	private String rank;
	private int[] moneyInfo = new int[] { 0, 0, 0 };
	
	private String[] realUsersName = { "", "", "" };
	private String[] personalNumber = { "", "", "" }; //
	private String[] realphoneNumber = { "", "", "" }; //

	
	private String[] realUsersNameB = { "", "", "" };
	private String[] personalNumberB = { "", "", "" }; //
	private String[] realphoneNumberB = { "", "", "" }; //
	
	
	public Customer() {
		this.usersName = "";
		this.phoneNumber = "";
		this.realUsersName = new String[] { "", "", "" };
		this.realphoneNumber = new String[] { "", "", "" };
		this.personalNumber = new String[] { "", "", "" };
		this.rooms = new int[] { 0, 0, 0 };
		this.roomsB = new String[] { "", "", "" };
		this.realUsersNameB = new String[] { "", "", "" };
		this.personalNumberB = new String[] { "", "", "" };
		this.realphoneNumberB = new String[] { "", "", "" };
		this.money = random.nextInt(100000) + 200000;
		useMoney = 0;
		rank = "브론즈";

	}

	public int getUseMoney() {
		return useMoney;
	}

	public void setUseMoney(int useMoney) {
		this.useMoney = useMoney;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int[] getMoneyInfo() {
		return moneyInfo;
	}

	public void setMoneyInfo(int[] moneyInfo) {
		this.moneyInfo = moneyInfo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String[] getRealUsersName() {
		return realUsersName;
	}

	public void setRealUsersName(String[] realUsersName) {
		this.realUsersName = realUsersName;
	}

	public String[] getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String[] personalNumber) {
		this.personalNumber = personalNumber;
	}

	public String[] getRealphoneNumber() {
		return realphoneNumber;
	}

	public void setRealphoneNumber(String[] realphoneNumber) {
		this.realphoneNumber = realphoneNumber;
	}

	public int[] getRooms() {
		return rooms;
	}

	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}

	public String[] getRoomsB() {
		return roomsB;
	}

	public void setRoomsB(String[] roomsB) {
		this.roomsB = roomsB;
	}

	public void settingPersnalNumber(String personalNumber) {
		for (int i = 0; i < 3; i++) {
			if (this.personalNumber[i] == "") {
				this.personalNumber[i] = personalNumber;
				break;
			}
		}
	}
	
	public void settingRealUserName(String realUsersName) {
		for (int i = 0; i < 3; i++) {
			if (this.realUsersName[i] == "") {
				this.realUsersName[i] = realUsersName;
				break;
			}
		}
	}
	
	public void settingRealPhoneNumber(String realphoneNumber) {
		for (int i = 0; i < 3; i++) {
			if (this.realphoneNumber[i] == "") {
				this.realphoneNumber[i] = realphoneNumber;
				break;
			}
		}
	}
	
	
	public void settingPersnalNumberB(String personalNumber) {
		for (int i = 0; i < 3; i++) {
			if (this.personalNumberB[i] == "") {
				this.personalNumberB[i] = personalNumber;
				break;
			}
		}
	}
	
	public void settingRealUserNameB(String realUsersName) {
		for (int i = 0; i < 3; i++) {
			if (this.realUsersNameB[i] == "") {
				this.realUsersNameB[i] = realUsersName;
				break;
			}
		}
	}
	
	public void settingRealPhoneNumberB(String realphoneNumber) {
		for (int i = 0; i < 3; i++) {
			if (this.realphoneNumberB[i] == "") {
				this.realphoneNumberB[i] = realphoneNumber;
				break;
			}
		}
	}
	
	
	
	public void settingRooms(int rooms) {
		for (int i = 0; i < 3; i++) {
			if (this.rooms[i] == 0) {
				this.rooms[i] = rooms;
				break;
			}
		}
	}

	
	//재민수정
	public void settingRoomsB(String roomsB) {
		for (int i = 0; i < 3; i++) {
			if (this.roomsB[i].equals("")) {
				this.roomsB[i] = roomsB;
				break;
			}
		}
	}
	public void cancelPersnalNumber(int input) {
		if (input == 0) {
			personalNumber[0] = "";
		}

		if (input == 1) {
			personalNumber[1] = "";
		}

		if (input == 2) {
			personalNumber[2] = "";
		}

	}
	
	
	public String[] getRealUsersNameB() {
		return realUsersNameB;
	}

	public void setRealUsersNameB(String[] realUsersNameB) {
		this.realUsersNameB = realUsersNameB;
	}

	public String[] getPersonalNumberB() {
		return personalNumberB;
	}

	public void setPersonalNumberB(String[] personalNumberB) {
		this.personalNumberB = personalNumberB;
	}

	public String[] getRealphoneNumberB() {
		return realphoneNumberB;
	}

	public void setRealphoneNumberB(String[] realphoneNumberB) {
		this.realphoneNumberB = realphoneNumberB;
	}

	public void cancelRealPhoneNumber(int input) {
		if (input == 0) {
			realphoneNumber[0] = "";
		}

		if (input == 1) {
			realphoneNumber[1] = "";
		}

		if (input == 2) {
			realphoneNumber[2] = "";
		}

	}
	
	public void cancelPersonalNumber(int input) {
		if (input == 0) {
			personalNumber[0] = "";
		}

		if (input == 1) {
			personalNumber[1] = "";
		}

		if (input == 2) {
			personalNumber[2] = "";
		}

	}
	
	public void cancelPersonalNumberB(int input) {
		if (input == 0) {
			personalNumberB[0] = "";
		}

		if (input == 1) {
			personalNumberB[1] = "";
		}

		if (input == 2) {
			personalNumberB[2] = "";
		}

	}
	
	
	
	public void cancelRealUserName(int input) {
		if (input == 0) {
			realUsersName[0] = "";
		}

		if (input == 1) {
			realUsersName[1] = "";
		}

		if (input == 2) {
			realUsersName[2] = "";
		}

	}
	
	
	public void cancelRealPhoneNumberB(int input) {
		if (input == 0) {
			realphoneNumberB[0] = "";
		}

		if (input == 1) {
			realphoneNumberB[1] = "";
		}

		if (input == 2) {
			realphoneNumberB[2] = "";
		}

	}
	public void cancelRealUserNameB(int input) {
		if (input == 0) {
			realUsersNameB[0] = "";
		}

		if (input == 1) {
			realUsersNameB[1] = "";
		}

		if (input == 2) {
			realUsersNameB[2] = "";
		}

	}
	
	
	
	public void cancelRoom(int input) {
		if (input == 0) {
			rooms[0] = 0;
		}

		if (input == 1) {
			rooms[1] = 0;
		}

		if (input == 2) {
			rooms[2] = 0;
		}

	}
	
	//재민수정
	public void cancelRoomB(int input) {
		if (input == 0) {
			roomsB[0] = "";
		}

		if (input == 1) {
			roomsB[1] = "";
		}

		if (input == 2) {
			roomsB[2] = "";
		}

	}
	
	public void plusUseMoney(int useMoney) {
		this.useMoney += useMoney;
	}

	public void plusMoneyInfo(int money) {
		for (int i = 0; i < 3; i++) {
			if (moneyInfo[i] == 0) {
				moneyInfo[i] = money;
				break;
			}
		}
	}

	public int returnMoneyInfoToIndex(int index) {
		int a = moneyInfo[index];
		return a;
	}

	public void changeMoneyInfo(int money, int index) {
		moneyInfo[index] = money;

	}
	public void plusMoney(int money) {
		this.money += money;
	}
	


}