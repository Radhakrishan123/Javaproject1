
import java.util.Scanner;
class Book{
    String bookname;
    int bookId;
    String authorname;
    int bookSerialNo;
    int issuedate;

    Book(String bookname,int bookId,String authorname,int bookSerialNo,int issuedate){
        this.bookname=bookname;
        this.bookId=bookId;
        this.authorname=authorname;
        this.bookSerialNo=bookSerialNo;
        this.issuedate=issuedate;
    }
    public int getBookId(){
        return bookId;
    }
    public String getBookname(){
        return bookname;
    }
    void display(){
        System.out.println("Book Name: "+bookname);
        System.out.println("Book Id: "+bookId);
        System.out.println("Author Name: "+authorname);
        System.out.println("Book Serial No: "+bookSerialNo);
        System.out.println("Issue Date:(YYYY-MM-DD) "+issuedate);
    }
}

class Library extends Book{
    Library(String bookname,int bookId,String authorname,int bookSerialNo,int issuedate){
        super(bookname,bookId,authorname,bookSerialNo ,issuedate);
    }
    void displayLibraryDetails(){
        System.out.println("Library Details");
        display();

    }
    void issueBook(){
        System.out.println("Book Issued Successfully");
    }

}
class LibraryManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Book Name: " );
        String bookname=sc.nextLine();
        System.out.print("Enter Book Id: " );
        int bookId=sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Author Name: " );
        String authorname=sc.nextLine();
        System.out.print("Enter Book Serial No: " );
        int bookSerialNo=sc.nextInt();
        System.out.print("Enter Issue Date: " );
        int issuedate=sc.nextInt();
            
            Library l = new Library(bookname, bookId, authorname, bookSerialNo , issuedate);
            l.displayLibraryDetails();
            l.issueBook();
    }
}