import java.util.HashSet;

public class HashsetSearch {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Java");
        hs.add("Python");
        hs.add("C++");

        if (hs.contains("Java")) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }
    }
}
//import java.util.HashSet;

//public class //HashSetUpdate {
//     public static void main(String[] args) {

//         HashSet<String> hs = new HashSet<>();

//         hs.add("Java");
//         hs.add("Python");
//         hs.add("C++");

//         hs.remove("Python");
//         hs.add("JavaScript");

//         System.out.println(hs);
//     }
// }
