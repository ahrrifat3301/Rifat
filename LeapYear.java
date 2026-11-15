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
