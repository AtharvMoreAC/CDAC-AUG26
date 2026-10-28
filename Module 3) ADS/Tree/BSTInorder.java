import java.util.Scanner;

public class BstInorder {
	static class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
			
		}
	}             
	static Node insert(Node root,int key) {
		if(root == null) {
			return new Node(key);
			
		}
		if(key < root.key) {
			root.left = insert(root.left,key);
		}
		else if(key > root.key) {
			root.right = insert(root.right,key);
		}
		return root;
		
	}
	static void inorder(Node root) {
		if(root == null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
	
	
	

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter number between 0 to 1000 ");
			int n = sc.nextInt();
			Node root = null;
			System.out.println("Enter the keys");
			for(int i =0 ;i <n ;i++) {
				int key = sc.nextInt();
				root = insert(root,key);
			}
			
			
			if(root == null) {
				System.out.println("no elements");
			}
			else {
				inorder(root);
			}
	}
	

}
