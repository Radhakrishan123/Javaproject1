import java.util.Scanner;
public class StudentMarksSystem {
    



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
//student roll number
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
//student class
        // Subject Marks
        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Mathematics Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter Computer Marks: ");
        int computer = sc.nextInt();

        // Total Marks of student 
        int total = java + english + maths + science + computer;

        // Percentage of all subjects
        double percentage = total / 5.0;

        // Grade Calculation of student 
        String grade;
// grade calculation based on percentage
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Pass or Fail determination
        String result;

        if (percentage >= 50) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        // Display Report Card of student 
        System.out.println("\n===============================");
        System.out.println("        REPORT CARD");
        System.out.println("===============================");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + roll);
        System.out.println("-------------------------------");
        System.out.println("Java         : " + java);
        System.out.println("English      : " + english);
        System.out.println("Mathematics  : " + maths);
        System.out.println("Science      : " + science);
        System.out.println("Computer     : " + computer);
        System.out.println("-------------------------------");
        System.out.println("Total Marks  : " + total + "/500");
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("===============================");// use to take space 

        sc.close();
    }
}
    

