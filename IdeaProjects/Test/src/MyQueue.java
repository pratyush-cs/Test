import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class MyQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        List l = List.of("Grapes", "Apple", "Hi", "Oranges", "Peach");
        queue.addAll(List.of("Grapes", "Apple", "Hi", "Oranges", "Peach")); //priority queue sorted by alphabets
//        Queue<String> llq = new LinkedList<>(l);
//        System.out.println(queue);
//        System.out.println(queue.poll()); //removes
//        System.out.println(queue);
//        System.out.println(llq.poll());

        PriorityBlockingQueue<String> pbq = new PriorityBlockingQueue<>(l);
//        for (int i = 1; i <= 6; i++)
//            System.out.println(pbq.poll().toString());

        ArrayDeque<String> aqd = new ArrayDeque<>(l);
        System.out.println(aqd);
        System.out.println(aqd.peekLast());
        System.out.println(aqd.offer("Guava"));
        System.out.println(aqd.add("Guava"));
        System.out.println(aqd);


    }


}

class StringLengthComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return Integer.compare(s1.length(), s2.length());
    }
}
