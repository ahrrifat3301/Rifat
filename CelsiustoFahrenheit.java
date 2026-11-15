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
