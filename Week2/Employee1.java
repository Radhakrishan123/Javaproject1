class Employee {

    int empId;
    String empName;
    double salary;

    // Parameterized Constructor
    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee1 Details");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }
}
public class Employee1 {

    public static void main(String[] args) {

        // Constructor is called here
        Employee e1 = new Employee(152, "Ram", 80000);

        // Display employee details
        e1.display();
    }
}
