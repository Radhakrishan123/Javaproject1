import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        HashMap<Integer, Employee> map = new HashMap<>();

        map.put(101, new Employee(101, "shyam", "IT", 50000));
        map.put(102, new Employee(102, "Rahul", "HR", 35000));
        map.put(103, new Employee(103, "Radha", "IT", 70000));
        map.put(104, new Employee(104, "Krishan", "Finance", 45000));
        map.put(105, new Employee(105, "Rohit", "IT", 60000));

        // Filter 
        System.out.println("Employees with Salary > 50000:");
        map.values().stream()
                .filter(emp -> emp.salary > 50000)
                .forEach(emp -> System.out.println(
                        emp.id + " " + emp.name + " " +
                        emp.department + " " + emp.salary));

        // Sort
        System.out.println("\nEmployees Sorted by Salary:");
        map.values().stream() .sorted(Comparator.comparingDouble(emp -> emp.salary)).forEach(emp -> System.out.println(
                        emp.id + " " + emp.name + " " +
                        emp.department + " " + emp.salary));

        // Count
        long count = map.values().stream().filter(emp -> emp.department.equals("IT"))
                .count();

        System.out.println("\nNumber of IT Employees: " + count);
    }
}