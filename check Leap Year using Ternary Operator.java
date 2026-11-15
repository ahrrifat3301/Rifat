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
