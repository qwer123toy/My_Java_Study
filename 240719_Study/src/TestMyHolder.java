
public class TestMyHolder {
	public static void main(String[] args) {
		MyImmutableHolder myHolder = new MyImmutableHolder(100);
		
		System.out.println(myHolder.getValue());
		MyImmutableHolder myStr = new MyImmutableHolder("aasd");
		MyImmutableHolder myDbl = new MyImmutableHolder(12.32);
		
		Object value = myStr.getValue();
		
	}
}
