import java.util.Scanner;

// Program to calculate Factorial

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        // Display result
        System.out.println("Factorial of " + num + " is " + fact);

        sc.close();
    }
}
