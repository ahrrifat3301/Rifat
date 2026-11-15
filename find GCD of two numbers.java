import java.util.Scanner;

// Program to find GCD of two numbers

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Calculate GCD using Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Display GCD
        System.out.println("GCD = " + a);

        sc.close();
    }
}
