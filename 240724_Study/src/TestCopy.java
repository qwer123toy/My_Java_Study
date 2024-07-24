import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {

	public static void main(String[] args) {
		File origin = new File("d:\\myFolder\\origin.txt");

		// 복사를 진행하기 위해 실제로는 없지만 객체로 생성
		File copy = new File("d:\\myFolder\\copy.txt");

		// 읽고 쓰기 위해 bufferStream 생성
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			bos = new BufferedOutputStream(new FileOutputStream(copy));
			bis = new BufferedInputStream(new FileInputStream(origin));
			//바이트 단위로 내용을 저장
			
			byte[] buf = new byte[1024];
			
			
			int length;
			while ((length = bis.read(buf)) != -1) {
				bos.write(buf, 0, length);
			}
//			bis.read(buf);
//			bos.write(buf);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bis != null)
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			if (bos != null)
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
