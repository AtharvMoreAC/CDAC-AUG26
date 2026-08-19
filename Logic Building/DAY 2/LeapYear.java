import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
         
	Scanner sc=new Scanner(System.in);
    	
         System.out.println("ENTER YEAR:");
	int year = sc.nextInt();
	int year ;;
	year = sc.nextInt();

	if (year%4==0 && year%100!=0 || year%400==0){

	System.out.println("The Given Year is a Leap Year");


}
else {System.out.println("The Given Year is not a Leap Year");
}

}



}