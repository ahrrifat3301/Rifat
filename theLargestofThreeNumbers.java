import java.util.Scanner;

// Program to find the Largest of Three Numbers

public class LargestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int largest;

        // Compare the three numbers
        if (a >= b && a >= c) {
            largest = a;

        } else if (b >= a && b >= c) {
            largest = b;

        } else {
            largest = c;
        }

        // Display largest number
        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}
