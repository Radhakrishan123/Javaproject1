public class Pyramidpattern {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    
//import java.util.Scanner;

// public class PyramidPattern {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) {

//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print stars
//             for (int j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }

//             // Move to next line
//             System.out.println();
//         }

//         sc.close();
//     }
// }
