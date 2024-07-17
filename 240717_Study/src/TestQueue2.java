import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestQueue2 {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();

		deque.offer("문자열1");
		deque.offer("문자열10");
		deque.offer("문자열100");
		deque.offer("문자열1000");

		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollLast());
		System.out.println(deque.size());

	}
}
