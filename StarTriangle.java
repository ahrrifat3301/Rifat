import java.util.Scanner;

// Program to print Star Triangle

public class StarTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print stars row by row
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
