import java.util.LinkedList;
import java.util.Collections;

// public class EmployeeLinkedList {
//     public static void main(String[] args) {

//         LinkedList<String> list = new LinkedList<>();

//         // 1. Insertion
//         list.add("Radha");
//         list.add("Keshav");
//         list.add("Yadav");
//         list.add("shyam");

//         System.out.println("Employee List:");
//         System.out.println(list);

//         // 2. Removal
//         list.remove("Keshav");

//         System.out.println("\nAfter Removal:");
//         System.out.println(list);

//         // 3. Sorting
//         Collections.sort(list);

//         System.out.println("\nAfter Sorting:");
//         System.out.println(list);

//         // 4. Printing
//         System.out.println("\nFinal Employee Records:");
//         for (String emp : list) {
//             System.out.println(emp);
//         }
//     }
// }


public class EmployeeLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Radha");
        list.add("Krishan");
        list.add("Yadav");

        // Add at beginning
        list.addFirst("Yadav");
        list.addFirst("Null");
        System.out.println(list);

        // Add at end
       // list.addLast("shyam");
        //list.addLast("");


        // Get first and last element
        //System.out.println("First: " + list.getFirst());
       // System.out.println("Last: " + list.getLast());

        // Remove first and last
       list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // Check if element exists
        //System.out.println(list.contains("Rahul"));
        //System.out.println(list.contains("shyam"));

        // Size of LinkedList
        //System.out.println("Size: " + list.size());

        // Print LinkedList
       // Collections.sort(list);
        //System.out.println(list);
       
    }
}