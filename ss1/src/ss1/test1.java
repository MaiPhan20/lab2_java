package ss1;

//Java program to demonstrate use of this keyword

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
       float p,r,t,sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi :");
        p=scan.nextFloat();
        System.out.print("Nhập vào lãi suất hàng tháng: ");
        r=scan.nextFloat();
        System.out.print("Nhập vào thời gian gửi");
        t=scan.nextFloat();
        scan.close();
        sinterest=(p*r*t)/100;
        System.out.println("Số tiền lãi là: "+sinterest);
    }
}

