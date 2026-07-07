import java.util.Scanner;
import java.time.LocalDate;;



class Book {
    String bookname;
    int bookId;
    String authorname;
    int bookSerialNo;
    LocalDate issuedate;

    Book(String bookname, int bookId, String authorname, int bookSerialNo, LocalDate issuedate) {
        this.bookname = bookname;
        this.bookId = bookId;
        this.authorname = authorname;
        this.bookSerialNo = bookSerialNo;
        this.issuedate = issuedate;
    }

    void display() {
        System.out.println("\nBook Name : " + bookname);
        System.out.println("Book Id : " + bookId);
        System.out.println("Author Name : " + authorname);
        System.out.println("Book Serial No : " + bookSerialNo);
        System.out.println("Issue Date : " + issuedate);
    }
}

class Library extends Book {

    String studentName;
    int studentId;
    LocalDate returnDate;

    Library(String bookname, int bookId, String authorname,
            int bookSerialNo, LocalDate issuedate,
            String studentName, int studentId,
    LocalDate returnDate) {

        super(bookname, bookId, authorname, bookSerialNo, issuedate);

        this.studentName = studentName;
        this.studentId = studentId;
        this.returnDate = returnDate;
    }

    void displayLibraryDetails() {
        System.out.println("\nLibrary Details");
        display();
    }

    void issueBook() {
        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Student ID : " + studentId);
        System.out.println("Return Date : " + returnDate);
        System.out.println("Book Issued Successfully");
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Name: ");
        String bookname = sc.nextLine();

        System.out.print("Enter Book Id: ");
        int bookId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Author Name: ");
        String authorname = sc.nextLine();

        System.out.print("Enter Book Serial No: ");
        int bookSerialNo = sc.nextInt();
        sc.nextLine();   
//System.out.print("Enter Issue Date (YYYY-MM-DD): ");
       // LocalDate issuedate = LocalDate.parse(sc.nextLine());


        
        LocalDate issuedate =LocalDate.now();
        

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Id: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Return Date (YYYY-MM-DD): ");
        // LocalDate returnDate = LocalDate.parse(sc.nextLine());
LocalDate returnDate = LocalDate.now();

        Library l = new Library(bookname, bookId, authorname,
                bookSerialNo, issuedate,
                studentName, studentId, returnDate);

        l.displayLibraryDetails();
        l.issueBook();

        sc.close();
    }
}
