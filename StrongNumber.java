import java.util.Scanner;

// Program to check Strong Number

public class StrongNumber {

    // Method to calculate factorial
    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Calculate factorial of each digit
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        // Check Strong Number
        if (sum == original) {
            System.out.println(original + " is a Strong Number");
        } else {
            System.out.println(original + " is not a Strong Number");
        }

        sc.close();
    }
}
