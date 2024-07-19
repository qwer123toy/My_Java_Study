import org.javatuples.Unit;

public class TestLibraryHolder {
	public static void main(String[] args) {
		Unit<String> unit = new Unit<String>("문자열 값");
		Object value = unit.getValue(0);
		System.out.println(value);
		String value0 = unit.getValue0().concat("2");
		System.out.println(value0);
	}
}
