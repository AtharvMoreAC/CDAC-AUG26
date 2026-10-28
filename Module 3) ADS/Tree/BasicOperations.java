package Tree;


public class BasicOperations {
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node (int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	static int idx = -1; 
	static Node build (int[] arr) {
		idx++;
		if(arr[idx] == -1) {
			return null;
		}
		Node newnode = new Node(arr[idx]);
		newnode.left = build(arr);
		newnode.right = build(arr);
		
		return newnode;
	}
	static int heightOfTree(Node root) {
		if(root == null) {
			return 0 ;
		}
		int left = heightOfTree(root.left);
		int right = heightOfTree(root.right);
		return 1+ Math.max(left, right);
		
	}
	
	static int totalNodes(Node root) {
		if(root == null) {
			return 0 ;
		}
		int leftc = totalNodes(root.left);
		 int rightc = totalNodes(root.right);
		return leftc+rightc+1 ;
		
	}

	static int sumOfnodes(Node root) {
		if(root == null) {
			return 0;
		}
		int lefttsum =  sumOfnodes(root.left);
		int rightsum = sumOfnodes(root.right);
		
		return lefttsum + rightsum + root.data;
		
	}
	
	static int   countLeaves(Node root) {
		if(root == null) {
			return 0 ;
		}
		if(root.left ==null && root.right==null) {
			return 1;
		}
		int c = countLeaves(root.left);
		int b = countLeaves(root.right);
		
		return c+b;
		
	}

	
	public static void main(String[] args) {
		int[] arr = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = build(arr);
		System.out.println(heightOfTree(root));
		System.out.println(totalNodes(root));
		System.out.println(sumOfnodes(root));
		System.out.println(countLeaves(root));
		
		
	}

}
