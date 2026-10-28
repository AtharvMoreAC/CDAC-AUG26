package Satck;
import java.util.*;
class Reverse{
	void checkReverse(String ss) {
		Stack<Character > st = new  Stack<>();
		int idx = 0;
		while(idx != ss.length()) {
		st.push(ss.charAt(idx));
		idx++;
		}
		StringBuilder r = new StringBuilder("");
		while(!st.isEmpty()) {
			r.append(st.pop());
		}
		System.out.println(r.toString());
	}
	
}

public class StackreverseString {
		public static void main(String[] args) {
			
			String s = "sarthak";
			
			 Reverse rr = new  Reverse();
			rr.checkReverse(s);
			
			
		}
}
