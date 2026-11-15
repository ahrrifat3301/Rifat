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
