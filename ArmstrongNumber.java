import java.util.Scanner;

// Program to check Armstrong Number

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Count total digits
        int digits = String.valueOf(num).length();

        // Calculate sum of powered digits
        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num = num / 10;
        }

        // Check Armstrong condition
        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        sc.close();
    }
}
