import java.util.*;

public class MySet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(Set.of(1, 2, 3, 4, 5));
        TreeSet<Integer> ts = new TreeSet<>(Set.of(1, 2, 3, 4, 5));

        System.out.println(ts.floor(2));
        System.out.println(ts.lower(2));

        System.out.println(ts.headSet(4)); //exclusive of 4
        System.out.println(ts.tailSet(2)); //inclusive of 2

        System.out.println(ts.subSet(2, true, 4, true)); //default-true,false


        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.comparingInt(String::length));

        queue.add("Paaa");
        queue.add("Aa");
        queue.add("Z");
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);
    }
}
