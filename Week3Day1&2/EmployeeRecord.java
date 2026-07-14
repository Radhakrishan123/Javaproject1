import java.util.ArrayList;
import java.util.Collections;


public class EmployeeRecord {
    public static void main(String[] args) {
        

        ArrayList<String> employees = new ArrayList<>();

        //  Insertion of employee
        employees.add("Radha");
        employees.add("Aman");
        employees.add("yadav");
        employees.add("shyam");

        System.out.println("Employee List:" +employees);
       // System.out.println(employees);
       System.out.println(employees.get(3)); // Accessing an employee by index
       System.out.println(employees.size());
       System.out.println(employees.set(0, "Ram")); // Getting the first employee

        // removing an employee
       // employees.remove("Aman");//remove by value
       // employees.remove(1);//removing by index
        System.out.println(employees);
        


        System.out.println("\nAfter Removal:");
        System.out.println(employees);

        //  Sorting of data
        Collections.sort(employees);

        System.out.println("\nAfter Sorting:");
        System.out.println(employees);
                


        // Printing
        System.out.println("\n Employee Records:");
        for (String emp : employees) {//for is used to iterate all the elements of the arraylist so it makws easy to print all the elements of the arraylist
            System.out.println(emp);
            //System.out.println(employees.get(0));
            //System.out.println(employees.get(1));
        }
    }
}
