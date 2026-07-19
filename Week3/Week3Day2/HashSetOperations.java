import java.util.*;

public class HashSetOperations {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        // add
        set.add("Ram");
        set.add("Shyam");
        set.add("Keshav");
        set.add("Madhav");
        set.add("Ram"); // Duplicate

        System.out.println("Original Set:");
        System.out.println(set);

        //  contains
        System.out.println("\nContains Ram? " + set.contains("krishan"));

        // remove
        set.remove("Madhav");
        System.out.println("\nAfter Removing Madhav:");
        System.out.println(set);

        //  size
        System.out.println("\nSize: " + set.size());

        //  isEmpty
        System.out.println("\nIs Empty? " + set.isEmpty());

        // addAll
        HashSet<String> set2 = new HashSet<>();
        set2.add("Mohan");
        set2.add("Sita");

        set.addAll(set2);

        System.out.println("\nAfter addAll():");
        System.out.println(set);

        //  removeAll
        set.removeAll(set2);

        System.out.println("\nAfter removeAll():");
        System.out.println(set);

        // retainAll
        HashSet<String> set3 = new HashSet<>();
        set3.add("Ram");
        set3.add("Rohit");

        set.retainAll(set3);

        System.out.println("\nAfter retainAll():");
        System.out.println(set);

        //  clear
        set.clear();

        System.out.println("\nAfter clear():");
        System.out.println(set);

        // isEmpty
        System.out.println("Is Empty? " + set.isEmpty());
    }
}