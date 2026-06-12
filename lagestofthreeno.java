public class lagestofthreeno {
    public lagestofthreeno() {
    }

    public static void main(String[] var0) {
     int a = 40;
     int b = 30;
     int c = 20;

     if(a>b && a>c){
        System.out.println("a is largest");
     }
     else if(b>a && b>c){
        System.out.println("b is largest");
     }
     else{
        System.out.println("c is largest");
     }
    }
    
}
// import java.util.Scanner;

// public class LargestOfThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         if(a >= b && a >= c) {
//             System.out.println("Largest Number = " + a);
//         }
//         else if(b >= a && b >= c) {
//             System.out.println("Largest Number = " + b);
//         }
//         else {
//             System.out.println("Largest Number = " + c);
//         }
//     }
// }
