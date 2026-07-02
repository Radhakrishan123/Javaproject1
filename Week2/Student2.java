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
