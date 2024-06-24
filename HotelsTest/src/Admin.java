import java.util.Arrays;
import java.util.Scanner;

public class Admin {

	private Customer[] customer = new Customer[100];
	private Rooms[] rooms2 = new Rooms[20];
	private Rooms[] rooms3 = new Rooms[20];
	private Rooms[] rooms4 = new Rooms[20];
	private Rooms[] rooms5 = new Rooms[20];

	
	private static String adminCode;
	Scanner scanner = new Scanner(System.in);
	
	public Admin() {
		
		for(int i=0; i<20; i++) {
			this.rooms2[i].setRoomsInfo(0);	
		}
		
		
	}

	// ���� ���ý� �����ִ� ȭ��
	public void AdminProcess(int checkManger) {
		//System.out.println(Arrays.deepToString(rooms2));
		
		
		System.out.println("\n==============================");
		System.out.println("����ũ ���� ���");
		System.out.println("ȯ���մϴ�.");
		System.out.println("1. ���� �����ϱ�");
		System.out.println("2. ���� ����ϱ�");
		System.out.println("3. ���� ��ȲȮ��");
		System.out.println("4. �̿��� ���� Ȯ��");
		System.out.println("5. �� ���� Ȯ��");
		System.out.println("\n==============================");
		System.out.print("�Է� : ");
		String choose = scanner.nextLine();

		switch (choose) {
		case "1":

			break;
		case "2":
			break;
		case "3":
			mainRoom();
			break;
		case "4":
			break;
		case "5":
			break;
		default:
			break;
		}
	}

	// û������ ���� �� �����ִ� ȭ��
	public void CleanerProcess() {
		System.out.println("\n==============================");
		System.out.println("û�� ���� ���");
		System.out.println("ȯ���մϴ�.");
		System.out.println("1. ���� ��ȲȮ��");
		System.out.println("2. û���ϱ�");
		System.out.println("\n==============================");
		System.out.print("�Է� : ");
		String choose = scanner.nextLine();

		switch (choose) {
		case "1":
			break;
		case "2":
			cleanRoom();
			break;
		default:
			break;

		}

	}

	// �� ���� Ȯ��(��ȭ��ȣ�� �̿�)
	public void customerInfoCheckByNumber() {
		System.out.println("\n==============================");
		System.out.println("�� ������ Ȯ���մϴ�.");
		System.out.println("Ȯ���� ���� ��ȭ��ȣ�� �Է��ϼ���.");
		System.out.println("==============================");
		System.out.print("�Է� : ");
		String name = scanner.next();
		scanner.nextLine();
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getPhoneNumber().equals(name)) {
				showCustomerInfo(i);
			}
		}
	}

	// �� ���� Ȯ��(�̸��� �̿�)
	public void customerInfoCheckByName() {
		System.out.println("\n==============================");
		System.out.println("�� ������ Ȯ���մϴ�.");
		System.out.println("Ȯ���� ������ �Է��ϼ���.");
		System.out.println("==============================");
		System.out.print("�Է� : ");
		String name = scanner.next();
		scanner.nextLine();
		for (int i = 0; i < customer.length; i++) {
			if (customer[i].getRealUsersName().equals(name) || customer[i].getUsersName().equals(name)) {
				showCustomerInfo(i);
			}
		}
	}

	// �ش� �� ���� �����ֱ�(�Ŵ���)
	public void showCustomerInfo(int customerIndex) {
		System.out.println("\n==============================");
		System.out.println("���� ���� : " + customer[customerIndex].getUsersName());
		System.out.println("�̿� ���� : " + customer[customerIndex].getRealUsersName());
		System.out.println("���� �� ��ȭ��ȣ : ");
		System.out.println("�̿� �� ��ȭ��ȣ : ");
		System.out.println("������ �� : " + customer[customerIndex].getRooms().toString());
		System.out.println("==============================\n");
	}

	// �ش� �� ���� �����ֱ�(������)
	public void showCustomerInfo(int customerIndex, int checkManager) {
		System.out.println("\n==============================");
		System.out.println("���� ���� : " + customer[customerIndex].getUsersName());
		System.out.println("�̿� ���� : " + customer[customerIndex].getRealUsersName());
		System.out.println("���� �� ��ȭ��ȣ : ");
		System.out.println("�̿� �� ��ȭ��ȣ : ");
		if (checkManager == 1)
			System.out.println("�̿� �� �ֹι�ȣ : ");
		System.out.println("������ �� : " + customer[customerIndex].getRooms().toString());
		System.out.println("==============================\n");
	}

	// �� ���� ��� ����
	public void showAllCustomerInfo() {

	}

	// ���� û���Ͽ� �� ���¸� ����
	public int cleanRoom() {
		System.out.println("���� û���Ͻðڽ��ϱ�?(Y/N)");
		String clean = scanner.next();
		scanner.nextLine();
		if (clean.equals("Y") || clean.equals("y")) {
			System.out.println("û�Ұ� �Ϸ�Ǿ����ϴ�.");
			return 0;
		} else {
			System.out.println("�ִ��� ������ û�Ҹ� ���ּ���.");
			return 3;
		}

	}

	///////////////////////////////////////////////////////

	// �̱� ���� : ���ȣ�� ���ڸ� ���� Ȧ���̴�.
	// ���� ���� : ���ȣ�� ���ڸ� ���� ¦���̴�.
	// �迭�� 0 �� ���
	// �迭�� 1 �� ��� �ƴ�
	// �迭�� 2 �� �մ��� üũ�ƿ� �� û�������� ġ������ ��
	// û�������� ���� ġ�� �Ŀ��� �迭���� 0���� �ٲپ� �ٽ� ��밡��

	// ���� ��Ȳ Ȯ��
	public void mainRoom() {
		System.out.println();
		System.out.println("���ϴ� ������ �������ּ���");
		System.out.println("���� ��Ȳ");
		System.out.println("1. 2�� �� ���� : " + emptyRoomCheck(2) + "����");
		System.out.println("2. 3�� �� ���� : " + emptyRoomCheck(3) + "����");
		System.out.println("3. 4�� �� ���� : " + emptyRoomCheck(4) + "����");
		System.out.println("4. 5�� �� ���� : " + emptyRoomCheck(5) + "����");

	}

	// �޼ҵ忡 �Էµ� ������ �� ���� �� �� �ִ��� ���
	public int emptyRoomCheck(int floorNum) {

		int result = 0;

		if (rooms2 != null && floorNum == 2) {
			for (int i = 0; i < 20; i++) {
				if(rooms2[i] !=null) {
				if ( rooms2[i].getRoomsInfo() == 0) {
					result++;
				}
				}
			}
		}

		if (rooms3!= null && floorNum == 3) {
			for (int i = 0; i < 20; i++) {
				if (rooms3[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		if (rooms4!= null && floorNum == 4) {
			for (int i = 0; i < 20; i++) {
				if ( rooms4[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		if (rooms5!= null && floorNum == 5) {
			for (int i = 0; i < 20; i++) {
				if ( rooms5[i].getRoomsInfo() == 0) {
					result++;
				}
			}
		}

		return result;
	}

	// ����ڰ� ���� �� �� 201���� ��ȣ�� �Է��ϱ� ������ �� ���� ���� ������ �ε��� ��ȣ��
	// ��ȯ�ϴ� �޼ҵ�
	// 220��
	public int roomNumberChange(int num) {
		if (num >= 200 && 220 >= num) {
			return num - 200;
		} else if (num >= 300 && 320 >= num) {
			return num - 300;
		} else if (num >= 400 && 420 >= num) {
			return num - 400;
		} else if (num >= 500 && 520 >= num) {
			return num - 500;
		} else {
			System.out.println("�������� ��ȣ�� �Է����ּ���");
			System.out.println("���� 201ȣ���� 201�� �Է�");
			return -1;
		}

	}

	public void chooseRoom(int floorNum) {

		System.out.println();
		System.out.println("���ϴ� ������ �������ּ���");

		if (floorNum == 2) {
			for (int i = 0; i < 20; i++) {
				if (rooms2[i].getRoomsInfo() == 0) {
					System.out.printf("2%02dȣ�� �����\n", i + 1);
				} else if (rooms2[i].getRoomsInfo() == 1) {
					System.out.printf("2%02dȣ�� ����Ϸ�\n", i + 1);
				} else if (rooms2[i].getRoomsInfo() == 2) {
					System.out.printf("2%02dȣ�� û����\n", i + 1);
				}

			}
		}

		if (floorNum == 3) {
			for (int i = 0; i < 20; i++) {
				if (rooms3[i].getRoomsInfo() == 0) {
					System.out.printf("3%02dȣ�� �����\n", i + 1);
				} else if (rooms3[i].getRoomsInfo() == 1) {
					System.out.printf("3%02dȣ�� ����Ϸ�\n", i + 1);
				} else if (rooms3[i].getRoomsInfo() == 2) {
					System.out.printf("3%02dȣ�� û����\n", i + 1);
				}
			}
		}

		if (floorNum == 4) {
			for (int i = 0; i < 20; i++) {
				if (rooms4[i].getRoomsInfo() == 0) {
					System.out.printf("4%02dȣ�� �����\n", i + 1);
				} else if (rooms4[i].getRoomsInfo() == 1) {
					System.out.printf("4%02dȣ�� ����Ϸ�\n", i + 1);
				} else if (rooms4[i].getRoomsInfo() == 2) {
					System.out.printf("4%02dȣ�� û����\n", i + 1);
				}
			}
		}

		if (floorNum == 5) {
			for (int i = 0; i < 20; i++) {
				if (rooms5[i].getRoomsInfo() == 0) {
					System.out.printf("5%02dȣ�� �����\n", i + 1);
				} else if (rooms5[i].getRoomsInfo() == 1) {
					System.out.printf("5%02dȣ�� ����Ϸ�\n", i + 1);
				} else if (rooms5[i].getRoomsInfo() == 2) {
					System.out.printf("5%02dȣ�� û����\n", i + 1);
				}
			}
		}

	}

	public void reservation(int floorNum, int roomNum) {
		if (floorNum == 2) {
			if (rooms2[roomNum].getRoomsInfo() == 0) {
				rooms2[roomNum].setRoomsInfo(1);
				System.out.printf("%d�� %dȣ�� ������ �Ϸ�Ǿ����ϴ�.\n", floorNum, roomNum + 1);
			} else {
				System.out.println("������ �� �����ϴ�.");
			}
		} else if (floorNum == 3) {
			if (rooms3[roomNum].getRoomsInfo() == 0) {
				rooms3[roomNum].setRoomsInfo(1);
				System.out.printf("%d�� %dȣ�� ������ �Ϸ�Ǿ����ϴ�.\n", floorNum, roomNum + 1);
			} else {
				System.out.println("������ �� �����ϴ�.");
			}
		} else if (floorNum == 4) {
			if (rooms4[roomNum].getRoomsInfo() == 0) {
				rooms4[roomNum].setRoomsInfo(1);
				System.out.printf("%d�� %dȣ�� ������ �Ϸ�Ǿ����ϴ�.\n", floorNum, roomNum + 1);
			} else {
				System.out.println("������ �� �����ϴ�.");
			}
		} else if (floorNum == 5) {
			if (rooms5[roomNum].getRoomsInfo() == 0) {
				rooms5[roomNum].setRoomsInfo(1);
				System.out.printf("%d�� %dȣ�� ������ �Ϸ�Ǿ����ϴ�.\n", floorNum, roomNum + 1);
			} else {
				System.out.println("������ �� �����ϴ�.");
			}
		} else {
			System.out.println("�������� ������ �Է����ּ���");
		}

	}
}
