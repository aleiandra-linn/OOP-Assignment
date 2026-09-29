import java.util.Scanner;

public class BankDemoNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankNew bank = new BankNew();

        bank.addCustomer("Aleiandra", "Carissa", "aleiandra", "1234");
        bank.getCustomer(0).addAccount(new Account(500000));

        bank.addCustomer("Almira", "Ursula", "almira", "5678");
        bank.getCustomer(1).addAccount(new Account(1000000));

        int mainOption = 0;

        do {
            System.out.println("\n==========================================");
            System.out.println("       WELCOME TO CITYBANK ATM            ");
            System.out.println("==========================================");
            System.out.println("1. Account Login");
            System.out.println("2. Register New Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            if (scanner.hasNextInt()) {
                mainOption = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (mainOption) {
                case 1:
                    System.out.println("\n----------------- ATM LOGIN -----------------");
                    System.out.print("Enter Username: ");
                    String uname = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = scanner.nextLine();

                    Customer activeCustomer = bank.authenticate(uname, pass);

                    if (activeCustomer != null) {
                        System.out.println("\n>> Login Successful!");
                        personalATMMenu(scanner, activeCustomer);
                    } else {
                        System.out.println(">> Login Failed! Invalid Username or Password.");
                    }
                    break;

                case 2:
                    System.out.println("\n------------- CUSTOMER REGISTRATION -------------");
                    System.out.print("Enter First Name  : ");
                    String fn = scanner.nextLine();
                    System.out.print("Enter Last Name   : ");
                    String ln = scanner.nextLine();
                    System.out.print("Create Username   : ");
                    String newUname = scanner.nextLine();
                    System.out.print("Create Password   : ");
                    String newPass = scanner.nextLine();

                    bank.addCustomer(fn, ln, newUname, newPass);
                    int lastIdx = bank.getNumOfCustomer() - 1;
                    
                    System.out.print("Enter Initial Deposit (Rp): ");
                    double initBalance = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    
                    bank.getCustomer(lastIdx).addAccount(new Account(initBalance));
                    System.out.println(">> Registration Successful! Please log in using your account.");
                    break;

                case 3:
                    System.out.println("\nThank you for using CityBank ATM services. Goodbye!");
                    break;

                default:
                    System.out.println("\nInvalid menu option!");
                    break;
            }

        } while (mainOption != 3);

        scanner.close();
    }

    private static void personalATMMenu(Scanner scanner, Customer customer) {
        int accOption = 0;

        System.out.println("==========================================");
        System.out.println(" Welcome back, " + customer.getFirstName() + " " + customer.getLastName() + "!");
        System.out.println("==========================================");

        do {
            System.out.println("\n--- ACCOUNT TRANSACTION MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Logout");
            System.out.print("Select transaction (1-4): ");

            if (scanner.hasNextInt()) {
                accOption = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            Account acc = customer.getAccount();

            if (acc == null && accOption != 4) {
                System.out.println(">> Your bank account is not active. Please contact customer service.");
                continue;
            }

            switch (accOption) {
                case 1:
                    System.out.println("\n--- Balance Information ---");
                    System.out.println("Account Holder : " + customer.getFirstName() + " " + customer.getLastName());
                    System.out.println("Current Balance: Rp " + (long) acc.getBalance());
                    break;

                case 2:
                    System.out.println("\n--- Deposit Funds ---");
                    System.out.print("Enter deposit amount (Rp): ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();

                    if (acc.deposit(depositAmount)) {
                        System.out.println(">> Deposit Successful!");
                        System.out.println("   Updated Balance: Rp " + (long) acc.getBalance());
                    } else {
                        System.out.println(">> Deposit Failed! Amount must be greater than 0.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Withdraw Funds ---");
                    System.out.print("Enter withdrawal amount (Rp): ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();

                    if (acc.withdraw(withdrawAmount)) {
                        System.out.println(">> Withdrawal Successful!");
                        System.out.println("   Remaining Balance: Rp " + (long) acc.getBalance());
                    } else {
                        System.out.println(">> Withdrawal Failed! Insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("\n>> You have logged out successfully.");
                    break;

                default:
                    System.out.println("\nInvalid transaction option!");
                    break;
            }

        } while (accOption != 4);
    }
}