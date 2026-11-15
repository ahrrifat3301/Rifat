import java.util.Scanner;

// Program to swap two numbers

public class NumberSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display values before swapping
        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Display values after swapping
        System.out.println("After swap: a = " + a + ", b = " + b);

        sc.close();
    }
}
