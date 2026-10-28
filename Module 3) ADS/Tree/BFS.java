package Tree;
import java.util.*;

public class BFS {
	public static class Node{
		int data ;
		Node left ;
		Node right ;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static int  idx = -1;
	public static Node build (int[] arr) {
		idx++;
		
		if( arr[idx] == -1) {
			return null;
		}
		Node newnode =new Node(arr[idx]);
		newnode.left = build(arr);
		newnode.right = build(arr);
		return newnode;
	
	}
//	BFS
	public static void levelTraverse(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.remove();
			
			if(curr==null) {
				System.out.println();
				if(!q.isEmpty()) {
					q.add(null);
				}
				
			}
			else {
				System.out.print(curr.data);
				if(curr.left != null) {
					q.add(curr.left);
				}
				
				if(curr.right != null) {
					q.add(curr.right);
				}
				
			}
			
			
			
			}
			
			
		}

	public static void main(String[] args) {
		 BFS b = new BFS();
		int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		Node root = b.build(arr);
		levelTraverse(root);
		
	}

}
