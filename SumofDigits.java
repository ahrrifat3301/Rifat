import java.util.Scanner;

// Program to calculate Sum of Digits

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Extract and add each digit
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        // Display result
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
