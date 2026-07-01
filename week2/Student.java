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
class student {

    private int id;
    private String name;
    private double marks;

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
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
}
public class Student2 {

    public static void main(String[] args) {

        student s2 = new student();

        // Set values using Setter methods
        s2.setId(152);
        s2.setName("Radha Krishan");
        s2.setMarks(94.5);

        // Get and print values using Getter methods
        System.out.println("Student 2 Details");
        System.out.println("ID    : " + s2.getId());
        System.out.println("Name  : " + s2.getName());
        System.out.println("Marks : " + s2.getMarks());
    }
}

