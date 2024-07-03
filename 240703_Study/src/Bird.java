
public class Bird {
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


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj ==null)
			return false;
		if(!(obj instanceof Bird))
			return false;
		Bird down = (Bird) obj;
		return this.weight == down.weight;
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
	@Override
	public String toString() {
		return "Duck [getWeight()=" + getWeight() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
