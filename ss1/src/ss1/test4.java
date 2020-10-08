package ss1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        int orderShirts,orderedToures,points=0;
        int priceOfShirt=300;
        int priceOfTouser =700;
        int costOfShirts,costOfTousers,totalCost;
        double discount,netPay;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order: ");
        orderShirts=scan.nextInt();
        System.out.println("Enter the number of Toures to order: ");
        orderedToures=scan.nextInt();
        System.out.println("Item        Quantity       Price       Total");
        System.out.println("---------------------------------------------");
        costOfShirts=orderShirts*priceOfShirt;
        costOfTousers=orderedToures*priceOfTouser;
        System.out.println("Shirst"            +orderShirts      +priceOfShirt          + costOfShirts );
        System.out.println("Trouser      "     + orderedToures       +priceOfTouser         +costOfTousers);
        totalCost=costOfShirts+costOfTousers;
        discount=totalCost*10/100;
        if(totalCost>30000) {
            System.out.println("Discount" + discount);
        }else{
            System.out.println("Discount           0");
        }
        System.out.println("Net Total" +totalCost);
        System.out.println("-----------------------------------");
        System.out.println("Net Total ");
        System.out.println("Points Earned             0");
        System.out.println("------------------------------------");
        System.out.println("Thank You");
    }
}
