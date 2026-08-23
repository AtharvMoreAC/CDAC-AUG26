import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            sum = sum + num;
        }
		
        double average = (double) sum / arr.length;

        System.out.println("The average of the numbers is: " + average);
		
    }
}