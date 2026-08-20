import java.util.Scanner;

class SumOfNumbers {

    public void calculateSum() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int ans = 0;

        for (int i = n; i >= 1; i--) {
            ans = ans + i;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + ans);

        sc.close();
    }

    public static void main(String[] args) {

        SumOfNumbers s = new SumOfNumbers();
        s.calculateSum();
    }
}