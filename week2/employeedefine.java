public class employeedefine {

    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    public employeedefine(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Method
    public void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Salary  : " + salary);
    }

    public static void main(String[] args) {

        // Create object using constructor
        employeedefine e = new employeedefine(1, "Neha", 35000);

        System.out.println("Employee ID     : " + e.getId());
        System.out.println("Employee Name   : " + e.getName());
        System.out.println("Employee Salary : " + e.getSalary());

        e.display();
    }
}