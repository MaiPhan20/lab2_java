package ss1;



import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {


        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;
        System.out.println("Enter the Amount to withdraw: $");
        Scanner scan=new Scanner(System.in);
        withdraw=scan.nextDouble();
        possible=(accountBalance>withdraw);
        accountBalance=possible ? accountBalance-withdraw:accountBalance;
        System.out.println("#######");
        System.out.println("#######");
    }
}
