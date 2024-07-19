import lombok.AllArgsConstructor;
import lombok.Data;

public class MyDynamicHolder<T> {
	private T value;

	public MyDynamicHolder(T value) {
		super();
		this.value = value;
	}

	T getValue() {
		return value;
	}

	void setValue(T value) {
		this.value = value;
	}

}
