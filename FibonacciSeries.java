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
