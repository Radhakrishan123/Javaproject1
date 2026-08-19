import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDb e = new EmployeeDb();

        System.out.print("Enter ID: ");
        e.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter Name: ");
        e.setName(sc.nextLine());

        System.out.print("Enter Email: ");
        e.setEmail(sc.nextLine());

        System.out.print("Enter Department: ");
        e.setDepartment(sc.nextLine());

        System.out.print("Enter Salary: ");
        e.setSalary(sc.nextDouble());

        EmployeeDAO dao = new EmployeeDAOImpl();
        dao.addEmployee(e);

        sc.close();
    }
}