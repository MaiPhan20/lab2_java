package ss1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class maiphan2 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Nhập a= ");
        Scanner scan = new Scanner(System.in);
                a=scan.nextInt();
        System.out.println("Nhập b =");
        b=scan.nextInt();
        c=a+b;
        System.out.println("c="+c);
    }
}
