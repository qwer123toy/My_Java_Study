import java.io.File;

public class TestListFile {
	public static void printFileList(File folder) {
		for (File file : folder.listFiles()) {// 하위 폴더의 파일까지 모두 나오게 세팅

			if (file.isDirectory()) {// 하위 폴더 일 경우 해당 폴더에서 이 메서드를 다시 실행함
				printFileList(file);// 재귀함수
			} else {
				System.out.println(file.getName());
			}

		}
	}

	public static int countingDuplicate(File folder, String fileName) {
		int count = 0;
		for (File file : folder.listFiles()) {// 하위 폴더의 파일까지 모두 나오게 세팅
			if (file.isDirectory()) {// 하위 폴더 일 경우 해당 폴더에서 이 메서드를 다시 실행함
				count += countingDuplicate(file, fileName);
			} else {
				if (file.getName().equals(fileName))
					count++; // 특정한 이름이 있을 경우 count++
			}

		}
		return count;
	}

	public static void main(String[] args) {
		File myfolder = new File("d:\\myFolder");

		// printFileList(myfolder);
		System.out.println(countingDuplicate(myfolder, "2.txt"));
	}
}
