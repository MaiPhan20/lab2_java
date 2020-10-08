package ss1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        float Maths,Science,English,total1,total2,Percentage1,Percentage2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks obtained in Maths: ");
        Maths=scan.nextFloat();
        System.out.println("Enter Science obtained in Science: ");
        Science=scan.nextFloat();
        System.out.println("Enter English obtained in English");
        English=scan.nextFloat();
        total1=Maths+Science+English;
        Percentage1=total1*100/300;

        //////////////////////////
        System.out.println("Enter Marks obtained in Maths: ");
        Maths=scan.nextFloat();
        System.out.println("Enter Science obtained in Science: ");
        Science=scan.nextFloat();
        System.out.println("Enter English obtained in English");
        English=scan.nextFloat();
        total2=Maths+Science+English;
        System.out.println("Total ="+total1);
        System.out.println("Mark of Bill:");
        System.out.println("Maths="+Maths);
        System.out.println("Science="+Science);
        System.out.println("English="+English);
        System.out.println("Total ="+total1);
        System.out.println("Mark of David:");
        System.out.println("Maths="+Maths);
        System.out.println("Science="+Science);
        System.out.println("English="+English);
        System.out.println("Total ="+total2);
        System.out.println("Pecentage="+Percentage1 + "%");
        Percentage2=total2*100/300;
        System.out.println("Pecentage="+Percentage2 + "%");
        System.out.println("\n Is  perceantage lesser than Bill");
        System.out.println(Percentage1<Percentage2 ? "Yes":"No");
        System.out.println(" Is  perceantage greater than Bill");
        System.out.println(Percentage1>Percentage2 ? "Yes":"No");
        System.out.println(" David and bill percentage are equal");
        System.out.println(Percentage1==Percentage2 ? "Yes":"No");
        System.out.print("/n Scholarship Amount for David=$");
        System.out.println(Percentage1>75 ? 20000:(Percentage1>=60 && Percentage1<=75)?10000:0);
        System.out.print("Chorlaship Amount David");
        System.out.println(Percentage2>75 ? 20000:(Percentage2>=60 && Percentage2<=75)?10000:0);

    }
}
