1.
// Program to print Hello World

public class HelloWorld {
    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("Hello World!");
    }
}

2.
import java.util.Scanner;

// Program to check Prime Number

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Check whether number is prime
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}

3.
import java.util.Scanner;

// Program to check Palindrome Number

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        // Compare original and reversed number
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }

        sc.close();
    }
}

4.
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

5.
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


6.
import java.util.Scanner;

// Program to check Even or Odd

public class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close();
    }
}

7.
import java.util.Scanner;

// Program to check Leap Year

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Leap Year condition
        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0)) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close();
    }
}

8.
import java.util.Scanner;

// Program to convert Celsius to Fahrenheit

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.println(celsius + " Celsius = "
                + fahrenheit + " Fahrenheit");

        sc.close();
    }
}

9.
import java.util.Scanner;

// Program to check Perfect Number

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        // Find proper divisors
        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }

        // Check Perfect Number
        if (num > 0 && sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }

        sc.close();
    }
}

10.
import java.util.Scanner;

// Program to print Fibonacci Series

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        // Generate Fibonacci Series
        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}

11.
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

12.
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

13.
import java.util.Scanner;

// Program to print Star Triangle

public class StarTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print stars row by row
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

14.
import java.util.Scanner;

// Program to print a Pyramid

public class Pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Print pyramid spaces and stars
        for (int i = 1; i <= rows; i++) {

            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

15.
import java.util.Scanner;

// Program to print a Diamond pattern

public class Diamond {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Print upper half of diamond
        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print lower half of diamond
        for (int i = n - 1; i >= 1; i--) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

16.
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

17.
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

18.
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

19.
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

20.
import java.util.Scanner;

// Program to check Positive, Negative or Zero

public class PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check the sign of the number
        if (num > 0) {
            System.out.println(num + " is Positive");

        } else if (num < 0) {
            System.out.println(num + " is Negative");

        } else {
            System.out.println("The number is Zero");
        }

        sc.close();
    }
}

21.
import java.util.Scanner;

// Program to check Password using do-while loop

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";
        String input;

        // Keep asking until correct password is entered
        do {
            System.out.print("Enter password: ");
            input = sc.nextLine();

            if (!input.equals(correctPassword)) {
                System.out.println("Wrong password! Try again.");
            }

        } while (!input.equals(correctPassword));

        // Display success message
        System.out.println("Access granted!");

        sc.close();
    }
}

22.
// Program to create Student Class and Objects

class Student {

    String name;
    int roll;
    double marks;

    // Constructor
    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name
                + ", Roll: " + roll
                + ", Marks: " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        // Create three Student objects
        Student s1 = new Student("Rahim", 101, 85.5);
        Student s2 = new Student("Karim", 102, 90.0);
        Student s3 = new Student("Salma", 103, 78.5);

        // Display student details
        s1.display();
        s2.display();
        s3.display();
    }
}

23.
// Program to demonstrate Local and Instance Variables

public class VariableDemo {

    // Instance variable
    int instanceVar = 50;

    public void show() {

        // Local variable
        int localVar = 20;

        // Display both variables
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {

        // Create object
        VariableDemo obj = new VariableDemo();

        // Call show method
        obj.show();
    }
}

24.
// Program to demonstrate Shift Operators

public class ShiftOperator {
    public static void main(String[] args) {

        int num = 8; // Binary: 1000

        // Left shift operator
        int leftShift = num << 2;

        // Right shift operator
        int rightShift = num >> 1;

        // Display results
        System.out.println("Left Shift (8 << 2) = " + leftShift);
        System.out.println("Right Shift (8 >> 1) = " + rightShift);
    }
}

25.
import java.util.Scanner;

// Program to check Leap Year using Ternary Operator

public class LeapYearTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take year input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check leap year using ternary operator
        String result = ((year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0))
                ? year + " is a Leap Year"
                : year + " is not a Leap Year";

        // Display result
        System.out.println(result);

        sc.close();
    }
}

26.
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

27.
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

28.
// Program to display feelings after completing Java practice

public class Feelings {
    public static void main(String[] args) {

        // Display motivational messages
        System.out.println(
            "I feel great and more confident in Java programming!"
        );

        System.out.println(
            "Practice makes perfect. Keep coding!"
        );
    }
}
