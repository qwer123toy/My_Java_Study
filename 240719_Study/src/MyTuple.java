import lombok.AllArgsConstructor;
import lombok.Data;

public class MyTuple<K, V, A, B> {
	private K key;
	private V value;
	private A a;
	private B b;
	
	
	public MyTuple(K key, V value, A a, B b) {
		super();
		this.key = key;
		this.value = value;
		this.a = a;
		this.b = b;
	}
	K getKey() {
		return key;
	}
	void setKey(K key) {
		this.key = key;
	}
	V getValue() {
		return value;
	}
	void setValue(V value) {
		this.value = value;
	}
	A getA() {
		return a;
	}
	void setA(A a) {
		this.a = a;
	}
	B getB() {
		return b;
	}
	void setB(B b) {
		this.b = b;
	}
	

}
