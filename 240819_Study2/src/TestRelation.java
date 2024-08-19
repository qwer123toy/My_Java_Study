
class Student {
	Pen pen;

	public void setPen(Pen pen) {
		this.pen = pen;
	}
}
class Pen {
	Student owner;

	public void setOwner(Student owner) {
		this.owner = owner;
	}
}

public class TestRelation {
	public static void main(String[] args) {
		Student s = new Student();
		Pen pen = new Pen();
		
		s.setPen(pen);
		pen.setOwner(s);
	}
}





