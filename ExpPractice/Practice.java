public class Practice {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            // Print 5 stars in each row
            for (int j = 0; j < 5; j++) {
                if(i==j|| i+j==5-1){

                
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
//this part is file handling 
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Welcome to Java");
            fw.close();

            System.out.println("File Written Successfully");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
