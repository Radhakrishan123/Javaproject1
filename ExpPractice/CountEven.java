import java.util.*;

public class CountEven {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 5, 8, 9, 10, 12);

        long count = list.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Even Numbers = " + count);
    }
}
