import java.util.List;
import java.util.Scanner;

public class Account {
    
    private static String passengerName;
    private static String password;
    private static boolean loggedIn = false;

    Scanner sc = new Scanner(System.in);


    public static void logOut(){
        int userId = 0;
        loggedIn = false;
    }

    public static void registerUser(String passengerName, String password) {
        Account account = new Account();
        account.passengerName = passengerName;
        account.password = password;
    }   

    public static boolean login(String passengerName, String password) {
        if(passengerName.equals(Account.passengerName) && password.equals(Account.password)) {
            return true;
        } {
            return false;
        }
    }

    public void reservationMenu() {
        
        while (loggedIn) {
            System.out.println("+--------------------------------------------+");
            System.out.println("              Reservation Interface           ");
            System.out.println("+--------------------------------------------+");
            System.out.println("1. Make Reservation\n2. Cancel Reservation\n3. Check Tickets\n4. Logout");
            System.out.println("+--------------------------------------------+");
            System.out.println();
            System.out.print("Choose option : ");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    makeReservation();
                case 2:
                    cancelReservation();
                case 3:
                    displayAllTickets();
                case 4:
                    logOut();
                default:
                    System.out.println("Choose a correct a option");
            }
        }
    }

    public void makeReservation() {
        System.out.println("Reserve a Reservation");
        System.out.println("+------------------------+");

              System.out.println("Enter your Source station : ");
              String source = sc.nextLine();

              System.out.println("Enter your destination : ");
              String destination = sc.nextLine();
    }


}
