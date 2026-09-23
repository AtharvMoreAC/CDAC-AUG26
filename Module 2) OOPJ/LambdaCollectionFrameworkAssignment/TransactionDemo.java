import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;

public class TransactionDemo {

    public static void main(String[] args) {

        ArrayList<Transaction> transactions = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("\nEnter Transaction " + (i + 1));

            System.out.print("Enter Transaction ID: ");
            int txId = sc.nextInt();

            System.out.print("Enter Transaction Date (yyyy-mm-dd): ");
            LocalDate txDate = LocalDate.parse(sc.next());

            System.out.print("Enter Transaction Amount: ");
            float txAmount = sc.nextFloat();

            System.out.print("Enter Transaction Status (true/false): ");
            boolean txStatus = sc.nextBoolean();

            System.out.print("Enter Transaction Arrears (true/false): ");
            boolean txArrears = sc.nextBoolean();

            Transaction transaction = new Transaction(
                    txId, txDate, txAmount, txStatus, txArrears);

            transactions.add(transaction);
        }

        Predicate<Transaction> amountGreaterThan5000 =
                transaction -> transaction.txAmount > 5000;

        System.out.println("\nTransactions where amount > 5000:");

        for (Transaction transaction : transactions) {

            if (amountGreaterThan5000.test(transaction)) {
                System.out.println(
                        "ID: " + transaction.txId +
                        ", Amount: " + transaction.txAmount);
            }
        }

        Predicate<Transaction> statusFalse =
                transaction -> transaction.txStatus == false;

        System.out.println("\nTransactions where status is false:");

        for (Transaction transaction : transactions) {

            if (statusFalse.test(transaction)) {
                System.out.println(
                        "ID: " + transaction.txId +
                        ", Status: " + transaction.txStatus);
            }
        }

        Function<Transaction, Float> amountDue = transaction -> {

            if (transaction.txArrears) {
                return transaction.txAmount
                        + 500
                        + (transaction.txAmount * 18 / 100);
            } else {
                return transaction.txAmount;
            }
        };

        System.out.println("\nAmount Due:");

        for (Transaction transaction : transactions) {

            float due = amountDue.apply(transaction);

            System.out.println(
                    "ID: " + transaction.txId +
                    ", Amount Due: " + due);
        }

    }
}