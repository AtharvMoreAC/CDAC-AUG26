package sarthak.LinkedList;

public class LinkedList {
	
	public static class Node{
		public int data;
		public Node next;
		
		
		public Node(int data ){
			this.data = data;
			this.next = null;
		}
	}
	public static int size;
		public static Node Head;
		public static Node Tail;
		public void addFirst(int data){
			
//			creating new node.
			Node newNode = new Node(data);
			size++;
			if(Head == null) {
			  Head=Tail=newNode;
			  return;
			  
			}
//          refrencing
			newNode.next = Head;
//			change Head
			Head = newNode;		
		}
						public void addLast(int data) {
						Node newNode = new Node(data);
						size++;
						if(Head == null) {
							Head = Tail = newNode;
							return;
						}
						
						Tail.next =newNode ;
						
						 Tail =newNode;
						}
						
								public static void addAtindx(int idx,int data) {
									Node newNode = new Node (data);
									size++;
									 Node  prev = Head  ;
									 int i = 0;
									 while (i != idx-1 && prev != null) {
										 i++;
									 }
									 newNode.next = prev.next;
									 prev.next = newNode;
								}
								
								 public void removeFront() {
									 int temp = Head.data; 
									 Head = Head.next;
									 size--;
									 
								 }
								 
								 public void removeLast() {
									 size--;
									 int temp = Tail.data;
									 Node prev = Head;
									 for(int i = 0 ; i <= size-2;i++) {
										 prev = prev.next;
										 
									 }
									 temp = prev.next.data;
									 prev.next = null;
									 prev = Tail;
									 
									 
									 
									
								 }
								 public int size() {
									 return size;
								 }
								
								
								
	
		public void show() {
			Node temp = Head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(23);
		ll.addFirst(23);
		ll.addFirst(23);
		ll.addLast(34);
		ll.addLast(34);
		ll.addAtindx(2, 66);
		
		ll.show();
		ll.removeFront();
		System.out.println(" ");
		ll.show();
		System.out.println(" ");
		System.out.println(ll.size());
		ll.removeLast();
		ll.show();

	}

}
