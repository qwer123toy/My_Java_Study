package Quiz;
class Bird {
	private int weight;
	
	public Bird(int weight) {
		super();
		this.weight = weight;
	}
	

	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public void Fly() {
		System.out.println("³­´Ù¿ä");
	}
	
	public void Sound() {
		System.out.println("Âé»ØÂé»Ø");
	}
	
}

class Eagle extends Bird{

	public Eagle(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("µ¶µ¶");
	}
	
}
class Duck extends Bird{

	public Duck(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("´ö´ö");
	}
}

public class Q1 {
	public static void main(String[] args) {
		Eagle e = new Eagle(50);
		Duck d = new Duck(10);
		System.out.println(e.getWeight());
		e.Sound();
		d.Sound();
	}
	
	
	
}
