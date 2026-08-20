import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values of Variables");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Problem 1: Grade Evaluation System

                    int maths = 80;
                    int science = 85;
                    int history = 90;

                    double average = (maths + science + history) / 3.0;

                    System.out.println("Average Marks: " + average);

                    if (average >= 90) {
                        System.out.println("Grade: A");
                    } else if (average >= 70) {
                        System.out.println("Grade: B");
                    } else if (average >= 50) {
                        System.out.println("Grade: C");
                    } else if (average >= 30) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Fail");
                    }

                    break;


                case 2:
                    // Problem 2: Leap Year Check

                    System.out.print("ENTER YEAR: ");
                    int year = sc.nextInt();

                    if ((year % 4 == 0 && year % 100 != 0) ||
                            year % 400 == 0) {

                        System.out.println("The Given Year is a Leap Year");

                    } else {

                        System.out.println("The Given Year is not a Leap Year");
                    }

                    break;


                case 3:
                    // Problem 3: Day of the Week

                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {

                        case 1:
                            System.out.println("The day is Monday.");
                            break;

                        case 2:
                            System.out.println("The day is Tuesday.");
                            break;

                        case 3:
                            System.out.println("The day is Wednesday.");
                            break;

                        case 4:
                            System.out.println("The day is Thursday.");
                            break;

                        case 5:
                            System.out.println("The day is Friday.");
                            break;

                        case 6:
                            System.out.println("The day is Saturday.");
                            break;

                        case 7:
                            System.out.println("The day is Sunday.");
                            break;

                        default:
                            System.out.println("Invalid day number");
                    }

                    break;


                case 4:
                    // Problem 4: Identify Default Values of Varables

                    byte a = 10;
                    short b = 20;
                    int c = 30;
                    long d = 40L;
                    float e = 50.5f;
                    double f = 60.5;
                    char g = 'A';
                    boolean h = true;

                    System.out.println("byte a = " + a);
                    System.out.println("short b = " + b);
                    System.out.println("int c = " + c);
                    System.out.println("long d = " + d);
                    System.out.println("float e = " + e);
                    System.out.println("double f = " + f);
                    System.out.println("char g = " + g);
                    System.out.println("boolean h = " + h);

                    break;


                case 5:
                    System.out.println("Exiting the program...");
                    break;


                default:
                    System.out.println("Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5);

       
    }
}