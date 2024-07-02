package Modifier;

public class People {

}
class Student extends People{
	public static void main(String[] args) {
		People p = new People();
		Student s = new Student();
		People upcasting = (People) new Student();
		Student downCasting = (Student)upcasting;
	}
}