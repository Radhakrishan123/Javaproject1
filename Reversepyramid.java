public class Reversepyramid {
    

    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=i-1;j++) {
                System.out.print(" ");
            }

            for(int j=1;j<=2*(n-i)+1;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
    
// import java.util.Scanner;

// public class ReversePyramid {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();

//         // Reverse Pyramid
//         for (int i = 1; i <= n; i++) {

//             // Print spaces
//             for (int j = 1; j <= i - 1; j++) {
//                 System.out.print(" ");
//             }

//             // Print stars
//             for (int j = 1; j <= 2 * (n - i) + 1; j++) {
//                 System.out.print("*");
//             }

//             // Move to the next line
//             System.out.println();
//         }

//         sc.close();
//     }
// }
