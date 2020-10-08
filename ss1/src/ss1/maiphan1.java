package ss1;

/**
 *
 * @author PC
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class maiphan1 {
    public static void main(String args[]) {
        int accountNumber;
        double accountBalance;
        System.out.println("Enter the details for the new Account to be ");
        System.out.println("Enter the Account Number:");
        Scanner scan = new Scanner(System.in);
        accountNumber=scan.nextInt();
        System.out.println("Enter The Account balance:");
        accountBalance=scan.nextDouble();
        System.out.println("The details ò the new account are");
        System.out.printf("Account Number : %d",accountNumber);
        System.out.printf("\nAccount Balance : %.2f",accountBalance);
    }
    }