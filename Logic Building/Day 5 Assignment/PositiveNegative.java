import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];

        int positive = 0;
        int negative = 0;

        System.out.println("Enter 6 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);

    }
}