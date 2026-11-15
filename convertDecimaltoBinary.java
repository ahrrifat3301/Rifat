import java.util.Scanner;

// Program to convert Decimal to Binary

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take decimal number input
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Display result
        System.out.println("Binary of " + decimal + " is " + binary);

        sc.close();
    }
}
