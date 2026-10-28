package Satck;
class StackList{
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;

		}
	}
	static Node Head = null;
	static int top ;
	static int size = 0;
	
	void push (int data) {
		Node nenode = new Node(data);
		
		if(Head == null) {
			Head = nenode;
			return;
		}
		nenode.next = Head;
		Head = nenode;
		
	}
		
	int pop() {
		
		
		if(Head == null) {
			return -1;
		}
		
		top = Head.data;
		
		Head = Head.next;
		return top;
	}
	
	int peek() {
		if (Head == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
		int ans = Head.data;
		return ans;
	}
	
	

	
	
	
	
	void display() {
		Node temp=Head;
		while(temp != null) {
			
			System.out.println(temp.data);
			temp =temp.next;
		}
	}
		
	
	
	
}

public class SatckLinkedList {
	public static void main(String[] args) {
		StackList s =new StackList();
		s.push(121);
		s.push(456);
		s.push(789);
		s.display();
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		
	}

}
