package ss6_7;

public class ss6_6 {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        do {
            sum = sum + num;
            num++;
        } while (num <= 10);

// Prints the value of variable after the loop terminates
        System.out.printf("Sum of 10 Numbers: %d\n", sum);
    }
}
