public class entry {

public static void main(String[] args) {

    employee[] arr = new employee[100];

    int count = 0;
    int current = 0;

    int choice;

    do {

        System.out.println("####################################################");
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Add Employee");
        System.out.println("2. Display");
        System.out.println("3. Sort");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("6. Exit");
        System.out.println("************ Enter the choice ************");
        System.out.println("####################################################");

        choice = consoleinput.getint();

        switch (choice) {

            case 1: {

                int cc;

                do {

                    System.out.println("\n===== ADD EMPLOYEE MENU =====");
                    System.out.println("1. Add Manager");
                    System.out.println("2. Add Engineer");
                    System.out.println("3. Add Salesperson");
                    System.out.println("4. Exit to Main Menu");
                    System.out.println("Enter the choice:");

                    cc = consoleinput.getint();

                    switch (cc) {

                        case 1: {

                            if (count >= arr.length) {
                                System.out.println("Employee array is full.");
                                break;
                            }

                            System.out.println("Enter the name:");
                            String name = consoleinput.getstring();

                            System.out.println("Enter the address:");
                            String address = consoleinput.getstring();

                            System.out.println("Enter age:");
                            int age = consoleinput.getint();

                            System.out.println("Enter the salary:");
                            float sal = consoleinput.getfloat();

                            System.out.println("Enter gender (true/false):");
                            boolean gender = consoleinput.getboolean();

                            System.out.println("Enter HRA:");
                            float hra = consoleinput.getfloat();

                            arr[count] = new manager(
                                    name, address, age, gender, sal, hra
                            );

                            count++;

                            System.out.println("Manager added successfully.");

                        } break;


                        case 2: {

                            if (count >= arr.length) {
                                System.out.println("Employee array is full.");
                                break;
                            }

                            System.out.println("Enter the name:");
                            String name = consoleinput.getstring();

                            System.out.println("Enter the address:");
                            String address = consoleinput.getstring();

                            System.out.println("Enter age:");
                            int age = consoleinput.getint();

                            System.out.println("Enter the salary:");
                            float sal = consoleinput.getfloat();

                            System.out.println("Enter gender (true/false):");
                            boolean gender = consoleinput.getboolean();

                            System.out.println("Enter overtime:");
                            int overtime = consoleinput.getint();

                            arr[count] = new engineer(
                                    name, address, age, gender, sal, overtime
                            );

                            count++;

                            System.out.println("Engineer added successfully.");

                        } break;


                        case 3: {

                            if (count >= arr.length) {
                                System.out.println("Employee array is full.");
                                break;
                            }

                            System.out.println("Enter the name:");
                            String name = consoleinput.getstring();

                            System.out.println("Enter the address:");
                            String address = consoleinput.getstring();

                            System.out.println("Enter age:");
                            int age = consoleinput.getint();

                            System.out.println("Enter the salary:");
                            float sal = consoleinput.getfloat();

                            System.out.println("Enter gender (true/false):");
                            boolean gender = consoleinput.getboolean();

                            System.out.println("Enter region:");
                            String region = consoleinput.getstring();

                            arr[count] = new salesperson(
                                    name, address, age, gender, sal, region
                            );

                            count++;

                            System.out.println("Salesperson added successfully.");

                        } break;


                        case 4: {

                            System.out.println("Returned to main menu.");

                        } break;


                        default:

                            System.out.println("Enter an appropriate choice.");
                    }

                } while (cc != 4);

            } break;


            case 2: {

                int cc;

                do {

                    System.out.println("\n===== DISPLAY MENU =====");
                    System.out.println("1. Display All Employees");
                    System.out.println("2. First Employee");
                    System.out.println("3. Next Employee");
                    System.out.println("4. Previous Employee");
                    System.out.println("5. Last Employee");
                    System.out.println("6. Exit to Main Menu");

                    System.out.println("Enter the choice:");

                    cc = consoleinput.getint();

                    switch (cc) {

                        case 1: {

                            if (count != 0) {

                                for (int itemp = 0; itemp < count; itemp++) {

                                    System.out.println("\nEmployee " + (itemp + 1));
                                    arr[itemp].display();
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;


                        case 2: {

                            if (count != 0) {

                                current = 0;
                                arr[0].display();

                            } else {

                                System.out.println("No employee.");
                            }

                        } break;


                        case 3: {

                            if (count != 0) {

                                if (current < count - 1) {

                                    current++;
                                    arr[current].display();

                                } else {

                                    System.out.println("Already at the last employee.");
                                }

                            } else {

                                System.out.println("No employee.");
                            }

                        } break;


                        case 4: {

                            if (count != 0) {

                                if (current > 0) {

                                    current--;
                                    arr[current].display();

                                } else {

                                    System.out.println("Already at the first employee.");
                                }

                            } else {

                                System.out.println("No employee.");
                            }

                        } break;


                        case 5: {

                            if (count != 0) {

                                current = count - 1;
                                arr[current].display();

                            } else {

                                System.out.println("No employee.");
                            }

                        } break;


                        case 6: {

                            System.out.println("Returned to main menu.");

                        } break;


                        default:

                            System.out.println("Enter an appropriate choice.");
                    }

                } while (cc != 6);

            } break;


            case 3: {

                int sc;

                do {

                    System.out.println("\n===== SORT MENU =====");
                    System.out.println("1. All Managers");
                    System.out.println("2. All Engineers");
                    System.out.println("3. All Sales Person");
                    System.out.println("4. All Employees Alphabetic Order Ascending");
                    System.out.println("5. All Employees Alphabetic Order Descending");
                    System.out.println("6. Exit to Main Menu");

                    System.out.println("Enter choice:");

                    sc = consoleinput.getint();

                    switch (sc) {

                        case 1: {

                            if (count != 0) {

                                boolean found = false;

                                for (int itemp = 0; itemp < count; itemp++) {

                                    if (arr[itemp] instanceof manager) {

                                        arr[itemp].display();
                                        System.out.println();

                                        found = true;
                                    }
                                }

                                if (!found) {
                                    System.out.println("No managers found.");
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;



                        case 2: {

                            if (count != 0) {

                                boolean found = false;

                                for (int itemp = 0; itemp < count; itemp++) {

                                    if (arr[itemp] instanceof engineer) {

                                        arr[itemp].display();
                                        System.out.println();

                                        found = true;
                                    }
                                }

                                if (!found) {
                                    System.out.println("No engineers found.");
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;



                        case 3: {

                            if (count != 0) {

                                boolean found = false;

                                for (int itemp = 0; itemp < count; itemp++) {

                                    if (arr[itemp] instanceof salesperson) {

                                        arr[itemp].display();
                                        System.out.println();

                                        found = true;
                                    }
                                }

                                if (!found) {
                                    System.out.println("No salespersons found.");
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;


                        case 4: {

                            if (count != 0) {

                                for (int itemp = 0; itemp < count - 1; itemp++) {

                                    for (int jtemp = itemp + 1;
                                         jtemp < count;
                                         jtemp++) {

                                        if (arr[itemp].getName()
                                                .compareToIgnoreCase(
                                                        arr[jtemp].getName()
                                                ) > 0) {

                                            employee temp = arr[itemp];

                                            arr[itemp] = arr[jtemp];

                                            arr[jtemp] = temp;
                                        }
                                    }
                                }

                                System.out.println(
                                        "Employees sorted in ascending order."
                                );

                                for (int itemp = 0; itemp < count; itemp++) {

                                    arr[itemp].display();
                                    System.out.println();
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;



                        case 5: {

                            if (count != 0) {

                                for (int itemp = 0; itemp < count - 1; itemp++) {

                                    for (int jtemp = itemp + 1;
                                         jtemp < count;
                                         jtemp++) {

                                        if (arr[itemp].getName()
                                                .compareToIgnoreCase(
                                                        arr[jtemp].getName()
                                                ) < 0) {

                                            employee temp = arr[itemp];

                                            arr[itemp] = arr[jtemp];

                                            arr[jtemp] = temp;
                                        }
                                    }
                                }

                                System.out.println(
                                        "Employees sorted in descending order."
                                );

                                for (int itemp = 0; itemp < count; itemp++) {

                                    arr[itemp].display();
                                    System.out.println();
                                }

                            } else {

                                System.out.println("No employees.");
                            }

                        } break;


                        case 6: {

                            System.out.println("Returning to Main Menu...");

                        } break;


                        default:

                            System.out.println("Invalid choice.");
                    }

                } while (sc != 6);

            } break;


            case 4: {

                System.out.println("Option 4 is currently not implemented.");

            } break;



            case 5: {

                System.out.println("Option 5 is currently not implemented.");

            } break;



            case 6: {

                System.out.println("Exited from program......");
                System.out.println("Thank you.");

            } break;


            default:

                System.out.println("Enter a valid choice.");
        }

    } while (choice != 6);
}


}
