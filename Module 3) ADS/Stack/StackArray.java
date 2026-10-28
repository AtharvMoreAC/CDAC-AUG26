package Satck;


	class StackArr{
		public int[] arr ;
		public int size;
		public static  int top = -1;
		
		StackArr(int size){
			this.size = size;
			arr = new int[size];
			top = -1;
			
		}

		public void push(int data) {
			if(top == size-1) {
				System.out.println("empty");
				return ;
			}
			top++;
			arr[top] = data;	
		}
		public int pop() {
			if(top == -1) {
				System.out.println("empty");
				return-1;
				
			}
			
			int data = arr[top];
			top--;
			return data;
			
		}
		
		
		public int peek() {
			if(top == -1) {
				System.out.println("empty");
				return-1;
				
			}
			return arr[top];
		}
		
		
		
		void display() {
			for (int i = top ; i >= 0;i-- ) {
				System.out.println(arr[i]);
			}
		}
		

	
	}

public class StackArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArr a = new StackArr(10);
	
		a.push(12);
		a.push(23);
		System.out.println(a.peek());
		
		a.display();
		System.out.println("pop"+a.pop());
		System.out.println("pop"+a.pop());
		System.out.println("----------------");
		a.display();
		


	}

}
