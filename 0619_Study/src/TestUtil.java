
public class TestUtil {
	public static void main(String[] args) {
		MyCharArrayUtil util = new MyCharArrayUtil();
		char[] world = {'a','b','c'};
		
		util.printElems(world);
		
		int index = util.findPrintElems(world, 'b');
		if(index<0)
			System.out.println("존재하지 않음");
		else {
			System.out.println("b의 index 위치 "+ index);
		}
		
		boolean index2 = util.exist(world, 'd');
		System.out.println(index2);
	}

}
