import java.util.Arrays;
import java.util.Scanner;

public class Admin {

	private Customer[] customer = new Customer[100];
	private Rooms[] rooms2 = new Rooms[20];
	private Rooms[] rooms3 = new Rooms[20];
	private Rooms[] rooms4 = new Rooms[20];
	private Rooms[] rooms5 = new Rooms[20];

	// private static String adminCode;
	Scanner scanner = new Scanner(System.in);

	public Admin() {

		for (int i = 0; i < 100; i++) {
			this.customer[i] = new Customer();
		}

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0) {
				this.rooms2[i] = new Rooms("single"); // Rooms 객체 생성
				this.rooms3[i] = new Rooms("single"); // Rooms 객체 생성
				this.rooms4[i] = new Rooms("single"); // Rooms 객체 생성
				this.rooms5[i] = new Rooms("single"); // Rooms 객체 생성
			} else {
				this.rooms2[i] = new Rooms("double"); // Rooms 객체 생성
				this.rooms3[i] = new Rooms("double"); // Rooms 객체 생성
				this.rooms4[i] = new Rooms("double"); // Rooms 객체 생성
				this.rooms5[i] = new Rooms("double");
			}

		}

	}

	// 직원 선택시 보여주는 화면
	public void AdminProcess(int checkManager) {
		// System.out.println(Arrays.deepToString(rooms2));

		System.out.println("\n==============================");
		if (checkManager == 1)
			System.out.println("지배인 모드");
		else
			System.out.println("데스크 직원 모드");

		System.out.println("환영합니다.");
		System.out.println("1. 객실 예약하기");
		System.out.println("2. 객실 취소하기");
		System.out.println("3. 객실 현황확인");
		System.out.println("4. 이용자 예약 확인");
		System.out.println("5. 전체 고객 정보 확인");
		System.out.println("\n==============================");
		System.out.print("입력 : ");
		String choose = scanner.next();
		scanner.nextLine();
		switch (choose) {
		case "1":
			makeCustomerInfo(checkManager); // 고객 정보 만들기로 이동
			break;
		case "2":
			customerInfoCheckChoose(checkManager);
			break;
		case "3":
			mainRoom("3", -1);
			break;
		case "4":
			customerInfoCheckChoose(checkManager);
			break;
		case "5":
			showAllCustomerInfo(checkManager);
			break;
		default:
			break;
		}
	}

	// 청소직원 선택 시 보여주는 화면
	public void CleanerProcess() {
		System.out.println("\n==============================");
		System.out.println("청소 직원 모드");
		System.out.println("환영합니다.");
		System.out.println("1. 객실 현황확인");
		System.out.println("2. 청소하기");
		System.out.println("\n==============================");
		System.out.print("입력 : ");
		String choose = scanner.nextLine();

		switch (choose) {
		case "1":
//			mainRoom("1",-1);
			break;
		case "2":
			cleanRoom();
			break;
		default:
			break;

		}

	}

	// 고객 정보 입력
	public void makeCustomerInfo(int checkManager) {

		System.out.println("\n==============================");
		System.out.println("고객 정보를 입력합니다.");
		System.out.println("이용하실 고객 이름을 입력하세요.");
		System.out.print("입력 : ");
		String realUserName = scanner.next();
		scanner.nextLine();
		System.out.println("이용하실 고객 전화번호를 입력하세요.");
		System.out.print("입력 : ");
		String realPhoneNumber = scanner.next();
		scanner.nextLine();
		System.out.println("예약자 고객 이름을 입력하세요.");
		System.out.print("입력 : ");
		String usersName = scanner.next();
		scanner.nextLine();
		System.out.println("예약자 고객 전화번호를 입력하세요.");
		System.out.print("입력 : ");
		String phoneNumber = scanner.next();
		scanner.nextLine();
		System.out.println("이용 고객 주민번호를 입력하세요.");
		System.out.print("입력 : ");
		String personalNumber = scanner.next();
		scanner.nextLine();
		int i = 0;
		for (i = 0; i < customer.length; i++) {
			if (customer[i].getPhoneNumber().equals(phoneNumber) && customer[i].getUsersName().equals(usersName)) {
				System.out.println("이미 예약한 내역이 존재합니다.");
				System.out.println("추가 예약하시겠습니까?(Y/N)");
				String reservationPlus = scanner.next();
				scanner.nextLine();
				if (reservationPlus.equals("Y") || reservationPlus.equals("y")) {
					plusCustomerRoom(i);
					break;
					
				}
			} else if (customer[i].getUsersName() == "") {

				this.customer[i].setPersonalNumber(personalNumber);
				this.customer[i].setPhoneNumber(phoneNumber);
				this.customer[i].setRealphoneNumber(realPhoneNumber);
				this.customer[i].setRealUsersName(realUserName);
				this.customer[i].setUsersName(usersName);
				mainRoom("1", i);
				break;
			}
		}

		// 방 입력을 받아야됨

	}

	// 고객 검색 방법 선택
	public void customerInfoCheckChoose(int checkManager) {
		System.out.println("\n==============================");
		System.out.println("고객 정보를 검색합니다.");
		System.out.println("어떤 방법으로 검색하시겠습니까?");
		System.out.println("1.고객 이름으로 찾기");
		System.out.println("2. 고객 전화번호로 찾기");
		System.out.println("==============================");
		System.out.print("입력 : ");

		String choose = scanner.next();
		scanner.nextLine();

		switch (choose) {
		case "1":
			customerInfoCheckByName(checkManager);
			break;
		case "2":
			customerInfoCheckByNumber(checkManager);
			break;
		default:
			System.out.println("올바른 번호를 입력하세요.");
			break;
		}

	}

	// 고객 정보 확인(전화번호를 이용)
	public void customerInfoCheckByNumber(int checkManager) {
		System.out.println("\n==============================");
		System.out.println("고객 정보를 확인합니다.");
		System.out.println("확인할 고객의 전화번호를 입력하세요.");
		System.out.println("==============================");
		System.out.print("입력 : ");
		String phoneNumber = scanner.next();
		scanner.nextLine();
		
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getPhoneNumber().equals(phoneNumber)
					|| customer[i].getRealphoneNumber().equals(phoneNumber)) {
				showCustomerInfo(i, checkManager);
				return;
			}
		}
			System.out.println("해당하는 고객이 없습니다.");
	}

	// 고객 정보 확인(이름을 이용)
	public void customerInfoCheckByName(int checkManager) {
		System.out.println("\n==============================");
		System.out.println("고객 정보를 확인합니다.");
		System.out.println("확인할 고객명을 입력하세요.");
		System.out.println("==============================");
		System.out.print("입력 : ");
		String name = scanner.next();
		scanner.nextLine();
//		if (customer[0].getRealUsersName().equals(name) || customer[0].getUsersName().equals(name)) {
//			showCustomerInfo(0, checkManager);
//		}
		
		for (int i = 0; i < customer.length; i++) {

			if (customer[i].getRealUsersName().equals(name) || customer[i].getUsersName().equals(name)) {
				showCustomerInfo(i, checkManager);
				return;
			}
		}
		
			System.out.println("해당하는 고객이 없습니다.");

	}

	// 해당 고객 정보 보여주기
	public void showCustomerInfo(int customerIndex, int checkManager) {
		System.out.println("\n==============================");
		System.out.println("예약 고객명 : " + customer[customerIndex].getUsersName());
		System.out.println("이용 고객명 : " + customer[customerIndex].getRealUsersName());
		System.out.println("예약 고객 전화번호 : " + customer[customerIndex].getPhoneNumber());
		System.out.println("이용 고객 전화번호 : " + customer[customerIndex].getRealphoneNumber());
		if (checkManager == 1)
			System.out.println("이용 고객 주민번호 : " + customer[customerIndex].getPersonalNumber());
		for (int i = 0; i < 3; i++) {
			if (customer[customerIndex].getRooms()[i] != 0)
				System.out.println("예약한 방 : " + customer[customerIndex].getRooms()[i]);
		}

		System.out.println("==============================\n");
		System.out.println("예약을 취소하시겠습니까?(Y/N)");
		System.out.print("입력 : ");
		String yesOrNo = scanner.next();
		scanner.nextLine();
		if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
			mainRoom("2", customerIndex);
		}
		else if(yesOrNo.equals("N") || yesOrNo.equals("n")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
		else {
			System.out.println("올바른 입력을 하세요.");
		}

	}

	// 고객 정보 모두 보기
	public void showAllCustomerInfo(int checkManager) {

		System.out.println("예약한 고객 정보를 모두 출력합니다.");
		System.out.println("어떤 식으로 보시겠습니까?");
		System.out.println("1. 층 별로 보기");
		System.out.println("2. 예약 순으로 보기");
		String choose = scanner.next();
		scanner.nextLine();

		switch (choose) {
		case "1":
			showFloorCustomer(checkManager);
			break;
		}

	}

	// 층 별로 고객 내용 출력
	public void showFloorCustomer(int checkManager) {

		System.out.println("2층 예약 중이거나 이용중인 고객");
		for (int i = 0; i < rooms2.length; i++) {

			if (rooms2[i].getRoomsInfo() == 1 || rooms2[i].getRoomsInfo() == 2) {
				int roomNumber = 201 + i;
				// int roomNumber = 212;

				for (int j = 0; j < customer.length; j++) {
					for (int k = 0; k < 3; k++) {
						if (customer[j].getRooms()[k] == roomNumber) {
							System.out.println("\n==============================");
							System.out.println("예약한 방 번호 : " + roomNumber);
							System.out.println("예약자 이름 : " + customer[j].getUsersName());
							System.out.println("예약자 전화번호 : " + customer[j].getPhoneNumber());
							System.out.println("이용자 이름 : " + customer[j].getRealUsersName());
							System.out.println("이용자 전화번호 : " + customer[j].getRealphoneNumber());
							if (checkManager == 1)
								System.out.println("이용자 주민번호 : " + customer[j].getPersonalNumber());
							System.out.println("==============================\n");

						}
					}
				}

			}
		}
	}

	public int cleanRoom() {
		int a = 414;

		System.out.println("방을 청소하시겠습니까?(Y/N)");
		String clean = scanner.next();
		scanner.nextLine();
		if (clean.equals("Y") || clean.equals("y")) {
			System.out.println("청소가 완료되었습니다.");
			return 0;
		} else {
			System.out.println("최대한 빠르게 청소를 해주세요.");
			return 3;
		}

	}

	public void plusCustomerRoom(int customerIndex) {
		
		int checkRoomEmpty=0;
		for(int a=0; a<3; a++) {
			if(customer[customerIndex].getRooms()[a] !=0)
				checkRoomEmpty++;
		}
		if(checkRoomEmpty==3) {
			System.out.println("방은 3개까지만 예약 가능합니다.");
			return;
		}
		
		System.out.println();
		System.out.println("원하는 층수를 선택해주세요");
		System.out.println("객실 현황");
		System.out.println("1. 2층 빈 객실 : " + emptyRoomCheck(2) + "객실");
		System.out.println("2. 3층 빈 객실 : " + emptyRoomCheck(3) + "객실");
		System.out.println("3. 4층 빈 객실 : " + emptyRoomCheck(4) + "객실");
		System.out.println("4. 5층 빈 객실 : " + emptyRoomCheck(5) + "객실");

		int chooseFloor = scanner.nextInt();
		int oneDigitNumber = chooseRoom(chooseFloor + 1);
		int chooseRoom = scanner.nextInt();

		while (chooseRoom % 2 != oneDigitNumber) {
			System.out.println("없는 방 번호입니다.");
			chooseRoom = scanner.nextInt();
		}
		if (customerIndex >= 0) {
			reservation(chooseFloor + 1, roomNumberChange(chooseRoom), chooseRoom, customerIndex);
		}
	}
	///////////////////////////////////////////////////////

	// 싱글 베드 : 방번호의 끝자리 수는 홀수이다.
	// 더블 베드 : 방번호의 끝자리 수는 짝수이다.
	// 배열값 0 은 빈방
	// 배열값 1 은 빈방 아님
	// 배열값 2 는 손님이 체크아웃 후 청소직원이 치워야할 방
	// 청소직원이 방을 치운 후에는 배열값을 0으로 바꾸어 다시 사용가능

	// 객실 현황 확인
	public void mainRoom(String mainSelectNum, int customerIndex) {

		if (mainSelectNum.equals("1")) {
			// 예약 할 때 아래 메소드 출력
			System.out.println();
			System.out.println("원하는 층수를 선택해주세요");
			System.out.println("객실 현황");
			System.out.println("1. 2층 빈 객실 : " + emptyRoomCheck(2) + "객실");
			System.out.println("2. 3층 빈 객실 : " + emptyRoomCheck(3) + "객실");
			System.out.println("3. 4층 빈 객실 : " + emptyRoomCheck(4) + "객실");
			System.out.println("4. 5층 빈 객실 : " + emptyRoomCheck(5) + "객실");

			int chooseFloor = scanner.nextInt();
			int oneDigitNumber = chooseRoom(chooseFloor + 1);
			int chooseRoom = scanner.nextInt();

			while (chooseRoom % 2 != oneDigitNumber) {
				System.out.println("없는 방 번호입니다.");
				chooseRoom = scanner.nextInt();
			}
			if (customerIndex >= 0) {
				reservation(chooseFloor + 1, roomNumberChange(chooseRoom), chooseRoom, customerIndex);
			}

		} else if (mainSelectNum.equals("2")) {
			// 취소할 때 아래 메소드 출력
			// 고객 정보를 확인하는 메소드는 미작성
			// int i = 1; // 아직 고객정보를 확인 못했기 때문에 임시로 i 값을 1로 주었음
			System.out.println("예약자 : " + customer[customerIndex].getUsersName());
			System.out.println("실 이용자 : " + customer[customerIndex].getRealUsersName());

			int reservationRoomCount = 0;
			for (int j = 0; j < customer[customerIndex].getRooms().length; j++) {
				if (customer[customerIndex].getRooms()[j] != 0) {
					System.out.println("현재 예약중인 방 : " + customer[customerIndex].getRooms()[j] + "호실");
					reservationRoomCount++;
				}

			}

			if (reservationRoomCount == 0) {
				System.out.println("예약하신 방이 없습니다.");
			} else {
				System.out.println("취소하실 방 번호를 입력해주세요");
				System.out.print("입력 : ");
				int cancel = scanner.nextInt();
				int checkZero = 0;

				if (cancel / 100 == 2) {
					for (int j = 0; j < 3; j++) {
						if (customer[customerIndex].getRooms()[j] == cancel) {
							System.out.println(cancel + "호 예약이 취소되었습니다.");
							customer[customerIndex].cancelRoom(j);
							rooms2[roomNumberChange(cancel)].setCustomerName("");
							rooms2[roomNumberChange(cancel)].setRoomsInfo(0);
						}
						if (customer[customerIndex].getRooms()[j] == 0) {
							checkZero++;
						}
					}
					if (checkZero == 3) {
						for (int k = 0; k < customer.length; k++) {
							customer[k].setPersonalNumber("");
							customer[k].setPhoneNumber("");
							customer[k].setUsersName("");
							customer[k].setRealphoneNumber("");
							customer[k].setRealUsersName("");
						}
					}

				}
//				
//				for (int j = 0; j < 3; j++) {
//					if (customer[customerIndex].getRooms()[j] == cancel) {
//						System.out.println(cancel + "호실 취소가 완료되었습니다.");
//						customer[customerIndex].cancelRoom(j);
//
//						if (cancel / 100 == 2) {
//							for (int k = 0; k < customer.length; k++) {
//								if (customer[k].getUsersName()
//										.equals(rooms2[roomNumberChange(cancel)].getCustomerName())) {
//
//									customer[k].setPersonalNumber("");
//									customer[k].setPhoneNumber("");
//									customer[k].setUsersName("");
//									customer[k].setRealphoneNumber("");
//									customer[k].setRealUsersName("");
//									rooms2[roomNumberChange(cancel)].setCustomerName("");
//									rooms2[roomNumberChange(cancel)].setRoomsInfo(0);
//								}
//							}
//
//						}
//						if (cancel / 100 == 3) {
//							rooms3[roomNumberChange(cancel)].setCustomerName("");
//							rooms3[roomNumberChange(cancel)].setRoomsInfo(0);
//						}
//						if (cancel / 100 == 4) {
//							rooms4[roomNumberChange(cancel)].setCustomerName("");
//							rooms4[roomNumberChange(cancel)].setRoomsInfo(0);
//						}
//						if (cancel / 100 == 5) {
//							rooms5[roomNumberChange(cancel)].setCustomerName("");
//							rooms5[roomNumberChange(cancel)].setRoomsInfo(0);
//						}
//
//					} else {
//						System.out.println("정상적인 방 번호를 입력해주세요");
//					}
				// }
			}

		} else if (mainSelectNum.equals("3")) {

		}

	}

	// 메소드에 입력된 층수의 빈 방이 몇 개 있는지 출력
	public int emptyRoomCheck(int floorNum) {

		int result = 0;

		if (rooms2 != null && floorNum == 2) {
			for (int i = 0; i < 20; i++) {

				if (rooms2[i].getRoomsInfo() == 0) {
					result++;
				}

			}
		}

		if (rooms3 != null && floorNum == 3) {
			for (int i = 0; i < 20; i++) {
				if (rooms3[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		if (rooms4 != null && floorNum == 4) {
			for (int i = 0; i < 20; i++) {
				if (rooms4[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		if (rooms5 != null && floorNum == 5) {
			for (int i = 0; i < 20; i++) {
				if (rooms5[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		return result;
	}

	// 사용자가 방을 고를 때 201같은 번호로 입력하기 때문에 그 값을 직접 대입할 인덱스 번호로
	// 변환하는 메소드
	// 220을
	public int roomNumberChange(int num) {

		while (true) {

			if (num >= 200 && 220 >= num) {// 210
				return num - 201; // 10
			} else if (num >= 300 && 320 >= num) {// 320
				return num - 301;// 20
			} else if (num >= 400 && 420 >= num) {// 415
				return num - 401;//
			} else if (num >= 500 && 520 >= num) {
				return num - 501;
			} else {
				System.out.println("정상적인 번호를 입력해주세요");
				System.out.println("예시 201호실은 201을 입력");
				num = scanner.nextInt();
			}
		}

	}

	public int chooseRoom(int floorNum) {

		System.out.println();

		while (true) {
			System.out.println("방의 타입을 선택해주세요.");
			System.out.println("1. Single 룸");
			System.out.println("2. Double 룸");
			int input = scanner.nextInt();
			if (input == 1) {
				System.out.println("원하는 객실을 선택해주세요");

				if (floorNum == 2) {
					for (int i = 0; i < 20; i++) {
						if (rooms2[i].getRoomsInfo() == 0 && i % 2 == 0) {
							System.out.printf("2%02d호실 비었음\n", i + 1);
						} else if (rooms2[i].getRoomsInfo() == 1) {
							System.out.printf("2%02d호실 예약완료\n", i + 1);
						} else if (rooms2[i].getRoomsInfo() == 2) {
							System.out.printf("2%02d호실 청소중\n", i + 1);
						}

					}
				}

				if (floorNum == 3) {
					for (int i = 0; i < 20; i++) {
						if (rooms3[i].getRoomsInfo() == 0 && i % 2 == 0) {
							System.out.printf("3%02d호실 비었음\n", i + 1);
						} else if (rooms3[i].getRoomsInfo() == 1) {
							System.out.printf("3%02d호실 예약완료\n", i + 1);
						} else if (rooms3[i].getRoomsInfo() == 2) {
							System.out.printf("3%02d호실 청소중\n", i + 1);
						}
					}
				}

				if (floorNum == 4) {
					for (int i = 0; i < 20; i++) {
						if (rooms4[i].getRoomsInfo() == 0 && i % 2 == 0) {
							System.out.printf("4%02d호실 비었음\n", i + 1);
						} else if (rooms4[i].getRoomsInfo() == 1) {
							System.out.printf("4%02d호실 예약완료\n", i + 1);
						} else if (rooms4[i].getRoomsInfo() == 2) {
							System.out.printf("4%02d호실 청소중\n", i + 1);
						}
					}
				}

				if (floorNum == 5) {
					for (int i = 0; i < 20; i++) {
						if (rooms5[i].getRoomsInfo() == 0 && i % 2 == 0) {
							System.out.printf("5%02d호실 비었음\n", i + 1);
						} else if (rooms5[i].getRoomsInfo() == 1) {
							System.out.printf("5%02d호실 예약완료\n", i + 1);
						} else if (rooms5[i].getRoomsInfo() == 2) {
							System.out.printf("5%02d호실 청소중\n", i + 1);
						}
					}
				}
				return 1;
			} else if (input == 2) {
				System.out.println("원하는 객실을 선택해주세요");
				System.out.println();
				if (floorNum == 2) {
					for (int i = 0; i < 20; i++) {
						if (rooms2[i].getRoomsInfo() == 0 && i % 2 != 0) {
							System.out.printf("2%02d호실 비었음\n", i + 1);
						} else if (rooms2[i].getRoomsInfo() == 1) {
							System.out.printf("2%02d호실 예약완료\n", i + 1);
						} else if (rooms2[i].getRoomsInfo() == 2) {
							System.out.printf("2%02d호실 청소중\n", i + 1);
						}

					}
				}

				if (floorNum == 3) {
					for (int i = 0; i < 20; i++) {
						if (rooms3[i].getRoomsInfo() == 0 && i % 2 != 0) {
							System.out.printf("3%02d호실 비었음\n", i + 1);
						} else if (rooms3[i].getRoomsInfo() == 1) {
							System.out.printf("3%02d호실 예약완료\n", i + 1);
						} else if (rooms3[i].getRoomsInfo() == 2) {
							System.out.printf("3%02d호실 청소중\n", i + 1);
						}
					}
				}

				if (floorNum == 4) {
					for (int i = 0; i < 20; i++) {
						if (rooms4[i].getRoomsInfo() == 0 && i % 2 != 0) {
							System.out.printf("4%02d호실 비었음\n", i + 1);
						} else if (rooms4[i].getRoomsInfo() == 1) {
							System.out.printf("4%02d호실 예약완료\n", i + 1);
						} else if (rooms4[i].getRoomsInfo() == 2) {
							System.out.printf("4%02d호실 청소중\n", i + 1);
						}
					}
				}

				if (floorNum == 5) {
					for (int i = 0; i < 20; i++) {
						if (rooms5[i].getRoomsInfo() == 0 && i % 2 != 0) {
							System.out.printf("5%02d호실 비었음\n", i + 1);
						} else if (rooms5[i].getRoomsInfo() == 1) {
							System.out.printf("5%02d호실 예약완료\n", i + 1);
						} else if (rooms5[i].getRoomsInfo() == 2) {
							System.out.printf("5%02d호실 청소중\n", i + 1);
						}
					}
				}
				return 0;
			} else {
				System.out.println("정상적인 번호를 입력해주세요");
			}

		}

	}

	public void reservation(int floorNum, int indexVerRoomNum, int basicNum, int customerIndex) {

		
		if (floorNum == 2) {
			if (rooms2[indexVerRoomNum].getRoomsInfo() == 0) {
				rooms2[indexVerRoomNum].setRoomsInfo(1);
				System.out.printf("%d층 %d호실 예약이 완료되었습니다.\n", floorNum, basicNum);
				System.out.printf("%s 고객이 예약했습니다.", customer[customerIndex].getUsersName());
				
				for (int i = 0; i < 3; i++) {
					if (customer[customerIndex].getRooms()[i] == 0) {
						customer[customerIndex].settingRooms(201 + indexVerRoomNum);
						rooms2[indexVerRoomNum].setCustomerName(customer[customerIndex].getUsersName());
						rooms2[indexVerRoomNum].setRealCustomerName(customer[customerIndex].getRealUsersName());
						break;
					}//customer[0] a a a a a [210,0,0]
					//room[9] = 1 210 더블 a a
					
					//customer[1] b b b b b [211,0,0]
					//room[10] = 1 211 싱글 b b
				}
			} else {
				System.out.println("예약할 수 없습니다.");
			}
		} else if (floorNum == 3) {
			if (rooms3[indexVerRoomNum].getRoomsInfo() == 0) {
				rooms3[indexVerRoomNum].setRoomsInfo(1);
				System.out.printf("%d층 %d호실 예약이 완료되었습니다.\n", floorNum, basicNum);
			} else {
				System.out.println("예약할 수 없습니다.");
			}
		} else if (floorNum == 4) {
			if (rooms4[indexVerRoomNum].getRoomsInfo() == 0) {
				rooms4[indexVerRoomNum].setRoomsInfo(1);
				System.out.printf("%d층 %d호실 예약이 완료되었습니다.\n", floorNum, basicNum);
			} else {
				System.out.println("예약할 수 없습니다.");
			}
		} else if (floorNum == 5) {
			if (rooms5[indexVerRoomNum].getRoomsInfo() == 0) {
				rooms5[indexVerRoomNum].setRoomsInfo(1);
				System.out.printf("%d층 %d호실 예약이 완료되었습니다.\n", floorNum, basicNum);
			} else {
				System.out.println("예약할 수 없습니다.");
			}
		} else {
			System.out.println("정상적인 층수를 입력해주세요");
		}

	}
}
