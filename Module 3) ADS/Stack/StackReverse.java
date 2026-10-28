package Satck;
import java.util.*;


public class StackReverse {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("After reverse:");
		Stack<Integer> s1 = new Stack<>();
		while(!s.isEmpty()) {
		s1.push(s.pop());
		}
		while(!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();
			
		}
		
		
		
	}
}
