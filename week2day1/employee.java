class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}

class Product {
    private int id;
    private String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
}

public class employeedefine {
    public static void main(String[] args) {

        Student s = new Student(101, "Radha");
        System.out.println(s.getId() + " " + s.getName());

        Employee e = new Employee(201, "Amit");
        System.out.println(e.getId() + " " + e.getName());

        Product p = new Product(301, "Laptop");
        System.out.println(p.getId() + " " + p.getName());
    }
}
