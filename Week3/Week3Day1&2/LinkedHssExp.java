import java.util.*;

public class LinkedHssExp {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Add elements
        lhs.add("Java");
        lhs.add("Python");
        lhs.add("C");
        lhs.add("Java");   // Duplicate value
        lhs.add(null);     // Allows  only one null value 

        System.out.println(lhs);

        //  contains()
        System.out.println( lhs.contains("Java"));

        //  size()
        System.out.println( lhs.size());

        //  isEmpty()
        System.out.println(lhs.isEmpty());

        //  remove()
        lhs.remove("C");
        System.out.println( lhs);

        //  addAll()
        LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
        lhs2.add("HTML");
        lhs2.add("CSS");
        lhs.addAll(lhs2);
        System.out.println( lhs);

        //  containsAll()
        System.out.println( lhs.containsAll(lhs2));//it is use to check whether one collection contains all the element of anpther element (boolean)

        //  removeAll
        lhs.removeAll(lhs2);
        System.out.println( lhs);

        

        // iterator
        System.out.print("Using Iterator : ");
        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        

        //  clear
        lhs.clear();
        System.out.println( lhs);

        //  isEmpty
        System.out.println(lhs.isEmpty());
    }
}