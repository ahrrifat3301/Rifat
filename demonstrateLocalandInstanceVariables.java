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
