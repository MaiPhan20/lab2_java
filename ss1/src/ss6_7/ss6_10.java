package ss6_7;

public class ss6_10 {
    public static void main(String[] args) {
        int num = 1;

        boolean flag = false;

        for (; !flag; num++) {
            System.out.println("Value of num: " + num);
            if (num == 5) {
                flag = true;
            }
        }
    }
}
