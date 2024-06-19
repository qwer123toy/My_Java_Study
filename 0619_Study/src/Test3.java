
public class Test3 {

	public static void main(String[] args) {
		double[] d = new double[3];
		
		System.out.println(d[0]);

		
		for (int i = 0; i <d.length; i++) {
			d[i] = 1.5 *(i+1);
		}
		System.out.println(d);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		d = new double[] {1.5, 3.0, 4.5};
		System.out.println(d);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);

	}
}
