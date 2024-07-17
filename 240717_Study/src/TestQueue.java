import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("문자열1");
		queue.offer("문자열10");
		queue.offer("문자열100");
		queue.offer("문자열1000"); // 크기가 넘으면 그냥 null처리
		
		queue.add("ㅁㄴㅇㄹ"); //예외처리 
		
		Stack<String> stack = new Stack<>();
		stack.add("문자열1");
		stack.add("문자열10");
		stack.add("문자열100");
		stack.add("문자열1000");
		stack.push("문자열10000");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
	}
}

