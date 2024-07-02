
public class Lion extends Animal{
	private int weight;

	public Lion(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Lion [weight=" + weight + "]";
	}

	public static void main(String[] args) {
		Lion l  = new Lion("Å©¾Ó",5,20);
		System.out.println(l.toString());
	}

}
