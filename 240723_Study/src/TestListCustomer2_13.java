import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestListCustomer2_13 {
	public static void main(String[] args) {
		File customerFile = new File("d:\\myFolder\\customer.txt");

		BufferedReader br = null;
		try {
			//직접 읽어올 수 없고 다른 Reader 객체를 이용하여 읽을 수 있음
			br = new BufferedReader(new FileReader(customerFile));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		
	}
}
