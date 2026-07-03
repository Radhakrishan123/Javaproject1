class Student1 {

    int id;
    String name;
    double marks;

    // Parameterized Constructor
    Student1(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Student 1 Details");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }
}
public class Student {

    public static void main(String[] args) {

        // Constructor is called here
        Student1 s1 = new Student1(152, "Radha Krishan", 94.5);

        // Display student details
        s1.display();
    }
}