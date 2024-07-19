import lombok.AllArgsConstructor;
import lombok.Data;

public class TestMyTuple {
	public static void main(String[] args) {
		MyTuple<Integer, String, Double, String> tuple = new MyTuple<Integer, String, Double, String>(100, "백",100.2,"fd");
//		MyTuple<Integer, Integer> tuple2 = new MyTuple<Integer, Integer>(100, 300);
//		MyTuple<Double, Double> tuple3 = new MyTuple<Double, Double>(100.23, 300.12);
		
		
		System.out.println(tuple.getKey());
		System.out.println(tuple.getValue());
		System.out.println(tuple.getA());
		System.out.println(tuple.getB());
	}

}

