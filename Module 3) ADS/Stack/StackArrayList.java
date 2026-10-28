package Satck;

import java.util.ArrayList;


class StackAL{
	static int top = -1; 
	static ArrayList<Integer> obj = new ArrayList<>();
	
	void push(int data) {
		obj.add(data);
		top++;
	}
	int pop() {
		if(obj.isEmpty()) {
			System.out.println("no any Element to pop  :");
			
			return -1;
		}
		
		int ans = obj.get(top);
		top--;
		return ans;
	}
	
	int peek() {
		return obj.get(top);
	}
	
	void display() {
//		 Iterator<Integer> itr= obj.iterator();
//		 while(itr.hasNext()){
//			 System.out.println(itr.next());
//		 }
		for(int i = obj.size()-1;i>=0;i--) {
			System.out.println(obj.get(i));
		}
		
	}
	 
	
}

public class StackArrayList {
	public static void main(String[] args) {
		StackAL s = new StackAL();
		s.push(89);
		s.push(9);
		s.push(10);
		s.display();
		System.out.println("-----------");
		System.out.println(s.peek());
		System.out.println("-----------");
		System.out.println("pop"+s.pop());
		System.out.println("pop"+s.pop());
		System.out.println("-----------");
		System.out.println(s.peek());
	}
	
	

}
