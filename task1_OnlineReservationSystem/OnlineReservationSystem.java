import java.util.Scanner;

public class OnlineReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Choose option : ");
        while(isRunning) {
            int opt = sc.nextInt();
            switch(opt) {
                case 1:
                    System.out.println("Register Form\n-------------");
                    System.out.print("Enter Your Name : ");
                    String passengerName = sc.next();
                    System.out.print("Enter Your Password : ");
                    String password = sc.next();
                    Account.registerUser(passengerName, password);
                    break;
                case 2:
                    System.out.println("Login Form\n----------");
                    System.out.print("Enter Your Name : ");
                    String loginPassengerName = sc.next();
                    System.out.print("Enter Your Password : ");
                    String loginPassword = sc.next();
                    boolean isLoggedIn = Account.login(loginPassengerName, loginPassword);
                    if (isLoggedIn) {
                        System.out.println("Login successful!");

                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting...");
                    break;
                default: 
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        sc.close(); // Close the scanner when done using it
    }
}
