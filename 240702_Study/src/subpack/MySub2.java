package subpack;
import Modifier.MySuper;

public class MySub2 extends MySuper {
	public void printAll() {
		//System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}

class AnotherClass{
	MySuper s;
	public void printAll() {
		//System.out.println(a); //private
		//System.out.println(s.b); // default
		System.out.println(s.c); // public
		//System.out.println(s.d); // protected
	}
}
