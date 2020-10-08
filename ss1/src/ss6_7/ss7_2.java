package ss6_7;

public class ss7_2 {
    // method accepting the argument by value
    public void setVal(int num1) {

        num1 = num1 + 10;
    }
    public static <PassByValue> void main(String[] args) {
        int num1 = 10;

        // Instantiate the PassByValue class
        PassByValue obj = new PassByValue();

        obj.setVal(num1);

        System.out.println("Value of num1 after invoking setVal is "+
                num1);
    }
}
}
