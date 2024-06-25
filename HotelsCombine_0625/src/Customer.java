
public class Customer {

	private String usersName; //
	private String realUsersName; //
	private String phoneNumber; //
	private String realphoneNumber; //
	private String personalNumber; //
	private int[] rooms = new int[] { 0, 0, 0 }; //

	public Customer() {
		this.usersName = "";
		this.realUsersName = "";
		this.phoneNumber = "";
		this.realphoneNumber = "";
		this.personalNumber = "";
		this.rooms = new int[] { 0, 0, 0 };
	}

	public String getUsersName() {
		return usersName;
	}

	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}

	public String getRealUsersName() {
		return realUsersName;
	}

	public void setRealUsersName(String realUsersName) {
		this.realUsersName = realUsersName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRealphoneNumber() {
		return realphoneNumber;
	}

	public void setRealphoneNumber(String realphoneNumber) {
		this.realphoneNumber = realphoneNumber;
	}

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public int[] getRooms() {
		return rooms;
	}

	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}
	
	public void settingRooms(int rooms) {
		for(int i=0; i<3; i++) {
			if(this.rooms[i] == 0) {
				this.rooms[i] = rooms;
				return;
			}
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

}