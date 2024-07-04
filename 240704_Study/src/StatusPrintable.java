import java.util.Objects;

interface AreaPrintable {
	void printArea();
}

public interface StatusPrintable {
	void printStatus();
}

interface Shape extends AreaPrintable, StatusPrintable{ //인터페이스는 다른 인터페이스 여러개를 상속 받을 수 있음
	
}

class Triangle implements Shape{
	private int width;
	private int height;
	
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public void printArea() {
		System.out.println("면적" + (double)(width * height*0.5));
		
	}
	@Override
	public void printStatus() {
		System.out.println(this.toString());
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Triangle))
			return false;
		Triangle other = (Triangle) obj;
		return height == other.height && width == other.width;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	
}

class Rectangle implements Shape{
	private int width;
	private int height;
	@Override
	public void printArea() {
		System.out.println("면적" + width * height);
		
	}
	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
}

class Person implements StatusPrintable {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}


	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public void printStatus() {
		
		System.out.println(this.toString());
	}

}