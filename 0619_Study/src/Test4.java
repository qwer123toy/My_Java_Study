
public class Test4 {

	public static void main(String[] args) {
		boolean[] b = new boolean[3];

		boolean[] datas = { true, true, false, true, false };
		int count =0;
		for(int i=0; i<datas.length;i++) {
			if(datas[i] ==true)
				count++;
		}
		System.out.println(count);
	}
}
