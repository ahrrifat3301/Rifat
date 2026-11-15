import java.util.Scanner;

// Program to print a Pyramid

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print pyramid spaces and stars
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
