import java.util.ArrayList;
import java.util.List;

public class ParallelNonParallelStreams {
    public static void main(String[] args) {
        int lim = Integer.MAX_VALUE / 2000;
        List<Integer> list = new ArrayList<>(lim);
        for (int i = 0; i < lim; i++) {
            list.add(i);
        }

        long startTime1 = System.nanoTime();
        System.out.println(list.stream().filter(ParallelNonParallelStreams::isPrime).count());
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println(duration1 + " ms");

        long startTime2 = System.nanoTime();
        System.out.println(list.parallelStream().filter(ParallelNonParallelStreams::isPrime).count());
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2) / 1000000;  //divide by 1000000 to get milliseconds.
        System.out.println(duration2 + " ms");

        System.out.println("Ratio: " + ((double) duration1 / duration2));
    }

    static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}