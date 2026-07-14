import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        // Add elements
        map.put("Ram", 20000);
        map.put("Shyam", 30000);
        map.put("Keshav", 50000);
        map.put("Madhav", 15000);

        System.out.println("Original Map:");
        System.out.println(map);

        //Get value using key
        System.out.println("\nSalary of Ram: " + map.get("Ram"));

        // containsKey
        System.out.println("\nContains key 'Shyam': "
                + map.containsKey("Shyam"));

        //  containsValue
        System.out.println("Contains value 50000: "
                + map.containsValue(50000));

        // size
        System.out.println("\nSize of map: " + map.size());

        //  isEmpty
        System.out.println("Is map empty? " + map.isEmpty());

        //  replace
        map.replace("Ram", 40000);
        System.out.println("\nAfter replacing Ram salary:");
        System.out.println(map);

        //  remove
        map.remove("Madhav");
        System.out.println("\nAfter removing Madhav:");
        System.out.println(map);

        //  keySet
        System.out.println("\nAll Keys:");
        System.out.println(map.keySet());

        //  values
        System.out.println("\nAll Values:");
        System.out.println(map.values());

        //  entrySet
        System.out.println("\nKey-Value Pairs:");
        System.out.println(map.entrySet());

        //  Iterate using entrySet
        System.out.println("\nUsing for-each loop:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //  getOrDefault
        System.out.println("\nSalary of Mohan: "
                + map.getOrDefault("Mohan", 0));

        //  putIfAbsent
        map.putIfAbsent("Mohan", 25000);
        map.putIfAbsent("Ram", 99999); // Won't replace existing value
        System.out.println("\nAfter putIfAbsent:");
        System.out.println(map);

        //  clear
        map.clear();
        System.out.println("\nAfter clear:");
        System.out.println(map);

        //  isEmpty
        System.out.println("Is map empty? " + map.isEmpty());
    }
}