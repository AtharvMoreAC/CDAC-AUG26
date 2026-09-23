import java.util.Scanner;
import java.util.function.Predicate;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		
		Predicate<Integer> isPrime = (num) -> {
			if(num < 2) {
				return false;
			}
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
		};
		
		boolean result = isPrime.test(number);
		
		if(result) {
			System.out.println(number + "is a Prime Number");
		}
		else {
			System.out.println(number + " is not a Prime Number");
		}
		
		
	}

}
