
    import java.util.Scanner;

public class employee {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public employee(int id, String name, double salary) {
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

    // Setter Method
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Method
    public void display() {
        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Create Object
        employee emp = new employee(id, name, salary);

        // Display Details
        emp.display();

        // Update Salary
        System.out.print("\nEnter New Salary: ");
        double newSalary = sc.nextDouble();

        emp.setSalary(newSalary);

        System.out.println("\nAfter Updating Salary");

        emp.display();

        sc.close();
    }
}
    

