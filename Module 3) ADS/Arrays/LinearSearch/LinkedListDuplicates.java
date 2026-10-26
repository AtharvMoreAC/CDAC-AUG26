import java.util.Scanner;

public class LinkedListDuplicates {
	static class Node {
		int data;
		Node next;
		Node(int d ){
			this.data = d;
		}
	}
	static Node insert (Node head ,int data) {
		
		Node newnode = new Node(data);
		if(head == null) {
			return newnode;
		}
		
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newnode;
		return head;
			
	}
	
	static void printDuplicates(Node head) {
		
		boolean found = false;
		Node curr = head;
		
//		st
		while(curr!=null) {
			Node temp = head;
			boolean alcheck = false;
			
//			Node tem = new Node(data);
			while(temp != curr) {
			if(temp.data ==  curr.data) {
				alcheck = true;
				break;
				
			}
			temp = temp.next;
			}
			
			if(!alcheck) {
				int c = 0;
				temp=head;
				while(temp!=null) {
					if(temp.data == curr.data) 
						c++;
						temp = temp.next;
					}
					if(c >1 ) {
						if(!found) {
							System.out.println(" Duplicate ");
							found = true;
						}
						System.out.println(curr.data+" "+c+""+"times");
					}
			}
				
				curr = curr.next;
			
			}
//		en
			if(!found) {
				System.out.println("no duplicated");
			}
			
			
		}
		
		
		
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		int n  = sc.nextInt();
		Node head = null;
		
		for(int i = 0 ; i < n ; i++) {
			int dd= sc.nextInt();
			head = insert(head,dd);			
}
		printDuplicates(head);
		
		
	}

}
