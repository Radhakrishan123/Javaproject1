class Employee {

    private int empId;
    private String empName;
    private double salary;

    // Setter Methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter Methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }
}
public class Employee2 {
    public static void main(String[] args) {

        Employee e2 = new Employee();

        // Set values using Setter methods
        e2.setEmpId(152);
        e2.setEmpName("Ram");
        e2.setSalary(80000);

        // Get values using Getter methods
        System.out.println("Employee2 Details");
        System.out.println("Employee ID   : " + e2.getEmpId());
        System.out.println("Employee Name : " + e2.getEmpName());
        System.out.println("Salary        : " + e2.getSalary());
    }
}
