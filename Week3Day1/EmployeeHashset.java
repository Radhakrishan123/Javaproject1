import java.util.*;


public class EmployeeHashset {
    public static void main(String[] args) {
        Set<String>names =new HashSet<>();
        names.add("ram");
        names.add("shyam");
        names.add("ganesha");
        names.add("kartikey");
        System.out.println(names);
        //removing
        names.remove("ram");
        names.remove("null");
        System.out.println(names);
        //Duplicate element add
        names.add("shyam");
        System.out.println(names);
        //finding size
        names.size();
        //contains value

        names.contains("ram");
        System.out.println(names);
        //empty or not
        System.out.println(names.isEmpty());
        //clear all elements
        names.clear();
        System.out.println(names);
        //add multiple elements
        names.addAll(Set.of("jay","kabir","rahim","sita","rohan"));
        System.out.println(names);
        //iterate (print one by one )
        for(String name :names){
            System.out.println(name);
        }
        //hashset size

        System.out.println(names.size());
        //check equality
        HashSet<String>set2 = new HashSet<>();
        set2.add("ganesha");
        set2.add("kartikey");
        System.out.println(names.equals(set2));
        //hashset allows only one null value stored
        names.add(null);
        names.add(null);
        System.out.println(names);







    }
    
}
