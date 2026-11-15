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
