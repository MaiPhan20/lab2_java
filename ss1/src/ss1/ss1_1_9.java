package ss1;

import java.util.Scanner;

public class ss1_1_9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int intvalue=s.nextInt();
        System.out.println("Enter a decimal number:");
        float floatValue=s.nextFloat();
        System.out.println("Enter a String value ");
        String strValue=s.next();
        System.out.println("Values entered are:");
        System.out.println(intvalue+""+floatValue+""+strValue);

    }
}
