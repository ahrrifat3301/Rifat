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
