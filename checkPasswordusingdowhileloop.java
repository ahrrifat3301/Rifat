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
