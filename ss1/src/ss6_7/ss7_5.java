package ss6_7;

public class ss7_5 {
    public void addNumber(int...num) {

        int sum=0;

        for(int i:num) {

            sum = sum + i;
        }

        System.out.println("Sum of numbers is "+ sum);
    }
    public static void main(String[] args) {

        Varargs obj = new Varargs();
        obj.addNumber(10,30,20,40);
    }
}

