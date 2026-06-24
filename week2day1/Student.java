import java.util.Scanner;

public class Student {

    // Data Members
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter Method
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Display Student Details
    public void display() {
        System.out.println("\n- Student Details -");
        System.out.println("Student ID    : " + id);
        System.out.println("Student Name  : " + name);
        System.out.println("Student Marks : " + marks);
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Student Details
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        double marks = sc.nextDouble();

        // Create Student Object
        Student student = new Student(id, name, marks);

        // Display Details
        student.display();

        // Update Marks
        System.out.print("\nEnter New Marks: ");
        double newMarks = sc.nextDouble();

        student.setMarks(newMarks);

        // Display Updated Details
        System.out.println("\nAfter Updating Marks:");
        student.display();

        sc.close();
    }
}
