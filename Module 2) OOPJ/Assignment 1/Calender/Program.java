public class Program {

    public static void main(String[] args) {

        Date objDate = new Date();

        int choice;

        do {

            System.out.println("-------------------------");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Compare Dates");
            System.out.println("7. Exit");
            System.out.println("-------------------------");

            System.out.print("Enter your choice: ");
            choice = consoleinput.getint();

            switch(choice) {

                case 1:

                    System.out.print("Enter day: ");
                    int day = consoleinput.getint();

                    System.out.print("Enter month: ");
                    int month = consoleinput.getint();

                    System.out.print("Enter year: ");
                    int year = consoleinput.getint();

                    objDate.setDate(day, month, year);

                    break;


                case 2:

                    System.out.print("Enter number of days: ");
                    int days = consoleinput.getint();

                    objDate.addDays(days);

                    break;


                case 3:

                    System.out.print("Enter number of months: ");
                    int months = consoleinput.getint();

                    objDate.addMonths(months);

                    break;


                case 4:

                    System.out.print("Enter number of years: ");
                    int years = consoleinput.getint();

                    objDate.addYear(years);

                    break;


                case 5:

                    objDate.display();

                    break;


                case 6:

                    System.out.println("Compare Dates - Not implemented yet.");

                    break;


                case 7:

                    System.out.println("Exiting program...");

                    break;


                default:

                    System.out.println("Invalid choice.");

            }

        } while(choice != 7);
    }
}