import java.util.Scanner;

// Program to check Positive, Negative or Zero

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check the sign of the number
        if (num > 0) {
            System.out.println(num + " is Positive");

        } else if (num < 0) {
            System.out.println(num + " is Negative");

        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}
