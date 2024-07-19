import lombok.AllArgsConstructor;
import lombok.Data;

public class TestMyDynamicHolder<T> {
	public static void main(String[] args) {
		MyDynamicHolder<String> my = new MyDynamicHolder<>("a");
		String value = my.getValue();
		
		MyDynamicHolder<Integer> your = new MyDynamicHolder<Integer>(100);
		Integer values2 = your.getValue();
		System.out.println(values2);
	}

}
