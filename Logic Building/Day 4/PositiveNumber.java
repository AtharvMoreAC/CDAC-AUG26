import java.util.Scanner;
	class PositiveNumber{
		
	public void askForPositiveNumber(){
		int a;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a positive number:");
			a=sc.nextInt();
			
			
		}
		while(a<1);
			System.out.println("You Have Entered a Positive Number ");
	}
	public static void main(String[] args){
		
		PositiveNumber obj = new PositiveNumber();
		
		obj.askForPositiveNumber();
	}
		
		
	}
		
		
	