package ss6_7;

public class ss6_11 {
    public static void main(String[] args) {
        int row, col;

// The outer for loop executes 5 times
        for (row = 1; row <= 5; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print(" * ");
            } // End of inner for loop

            System.out.println();
        } // End of outer for loop
    }
}
