import java.util.Scanner;
	public class SumOfTwoNum {
		
		public void calculate(int a , int b){
		//int x = a;
		//int y = b;
		int result =(a+b);
		System.out.println("Sum is :"+ result);
	
		}
		
		public static void main(String[] args){
			
			System.out.println("Enter the First Number : ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			System.out.println("Enter the Second Number : ");
		
			int b = sc.nextInt();
			
			SumOfTwoNum obj1 = new SumOfTwoNum();
			obj1.calculate(a,b);
		
					
			
			
		}
			
		
		
		
	}
	