import java.util.Scanner;

// Program to find LCM of two numbers

public class LCM {

    // Method to calculate GCD
    public static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate LCM using formula
        int lcm = (a * b) / gcd(a, b);

        // Display result
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
