import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
//code to create a new file
        File f= new File("createfile.txt");
       try{

        f.createNewFile();}
        catch(IOException e){
            System.out.println("unable to create this file");
            e.printStackTrace();
        }

    }
    
}
//code to write to a file
// try{
// FileWriter fileWriter= new FileWriter("createfile.txt");
// fileWriter.write("this is the first line from this java course\n ok now byee");
// fileWriter.close();

// }
// catch(IOException e){
//     e.printStackTrace();
// }
//     }
// }
////reading the file
//File myfile = new File("createfile.txt");

//File myfile = new File("this.txt");//external file can be reading
// try{
//     Scanner sc = new Scanner(myfile);
//     while(sc.hasNextLine()){
//         String line = sc.nextLine();
//         System.out.println(line);

//     }
//     sc.close();
// } catch(FileNotFoundException e){
//     e.printStackTrace();
    
// }
// }
// } 
//delete file 
// File myfile = new File("this.txt");
// if(myfile.delete()){
//     System.out.println("i have delted"+myfile.getName());

// }
// else{System.out.println("some problem occured while deletion the file");
// }
// }
// }
//  try {
//             FileOutputStream fos = new FileOutputStream("data.txt");

//             String text = "Hello Java";

//             fos.write(text.getBytes());

//             fos.close();

//             System.out.println("Data written successfully.");
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

//         try {
//             FileInputStream fis = new FileInputStream("data.txt");

//             int ch;
//             while ((ch = fis.read()) != -1) {
//                 System.out.print((char) ch);
//             }

//             fis.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }
// try {
//             FileReader fr = new FileReader("data.txt");

//             int ch;
//             while ((ch = fr.read()) != -1) {
//                 System.out.print((char) ch);
//             }

//             fr.close();
//         } catch (Exception e) {
//             System.out.println(e);
//         }
//     }
// }

