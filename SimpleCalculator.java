import java.util.Scanner;

// Program to create a Simple Calculator

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Take operator input
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        // Perform calculation using switch-case
        switch (op) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    sc.close();
                    return;
                }

                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        // Display result
        System.out.println("Result = " + result);

        sc.close();
    }
}
