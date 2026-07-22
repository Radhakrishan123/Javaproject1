
import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 8, 2, 10, 7, 4, 6, 12, 3);

        //  filter
        System.out.println("Even Numbers:");
        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //map
        System.out.println("\nMultiply by 2:");
        list.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        //  sorted
        System.out.println("\nSorted:");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        
        

        //  limit
        System.out.println("\nFirst 3 Elements:");
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        //  skip
        System.out.println("\nAfter Skipping 2:");
        list.stream().skip(2) .forEach(System.out::println);
        //  count
        long count = list.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("\nEven Count = " + count); 
        // forEach
        System.out.println("\nPrinting using forEach:");
        list.stream()
                .forEach(System.out::println);
    }
}
// import java.util.*;

// public class StreamDemo {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(5, 8, 2, 10, 7, 4);
// long count = list.stream()
//        // list.stream()
//             .filter(n -> n % 2 == 0)
             
//             //.limit(3)
//            // .forEach(System.out::println);
//             .map(n -> n * 2)
//             .sorted()
            
//                          //.filter(n -> n % 2 == 0)
//                          .count();

//         System.out.println("Even Numbers = " + count);
//         //   .forEach(System.out::println);
//     }
// }