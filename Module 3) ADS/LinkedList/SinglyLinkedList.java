public class SinglyLinkedList {
	 class Node{
			public int data;
			public Node next;
			Node(int data){
				this.data = data;
				this.next = null;
			}
		}
	static Node Head;
	static Node Tail;
	static int  size = 0 ;
	
	void addFirst(int data) {
		Node newNode = new Node(data) ;
		size++;
		if(Head == null) {
			Head = Tail = newNode;
			return;
		}
		newNode.next = Head;
		Head = newNode;
	}

	void addlast(int data) {
		Node newnode = new Node(data);
		size++;
		if(Head == null) {
			Head = Tail  = newnode;
			return ;
		}
		Tail.next = newnode;
		Tail = newnode;
		
	}
	
	void addAt(int idx,int data) {
		size++;
		Node temp=Head;
		
		
		if(idx==0) {
			addFirst(data);
			return;
		}
		if(idx==size) {
			addlast(data);
			return;
		}
		
	
			for(int i = 1 ; i < idx-1 ;i++ ) {
				temp= temp.next;
				
			}
				Node newnode = new Node(data);
				
				
				newnode.next = temp.next;
				temp.next = newnode;
				
				
		}
	
	void removeAt(int idx) {
		
		if(idx==0) {
			removefirst();
			return;
		}
		if(idx == size) {
			removelast();
			return;
		}
		
		
		
		Node curr = Head;
		
		for (int i = 0 ;i < idx-1 ;i++) {
			curr = curr.next;
		}
		Node gtar = curr.next;
		curr.next=curr.next.next;
		size--;
		
		
	}
	

	
	
	
	
	
	void removefirst() {
		Node temp = Head;
		
		Head = Head.next;
			size--;
		
	}
	void removelast() {
		int temp = Tail.data;
		Node prev = Head;
		
		
		for(int i = 0 ; i < size-2;i++) {
			prev = prev.next;
		}
//		temp = prev.next.data;
		prev.next  = null;
		 Tail = prev; 
		size--;
		
		
	}

	
	
	void show () {
		Node temp= Head ;
		while (temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println("");
		
	}
	
	
	void reverse() {
		Node pre=null;
		Node curr = Head;
		Node next = null;
		Tail =Head;
		while(curr!=null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr =next;
			
		}
		Head = pre;
	}
	
	
	
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.addlast(3);
		ll.addlast(4);
		ll.addlast(5);
		ll.addFirst(1);
		ll.show();
		ll.addAt(1, 2);
		ll.show();
		System.out.println("--------------");
		ll.removefirst();
		ll.show();
		System.out.println("--------------");
		ll.removelast();
		ll.show();
		System.out.println("--------------");
	System.out.println(ll.size);
	System.out.println("--------------");
	ll.reverse();
	ll.show();
	System.out.println("--------------");
	ll.addFirst(1111);
	System.out.println(ll.size);
	
		System.out.println("");
		
	}
	
}
