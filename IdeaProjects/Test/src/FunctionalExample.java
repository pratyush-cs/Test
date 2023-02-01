import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FunctionalExample {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>(List.of(1, 2, 3, 500, 1, 100, 5));

        System.out.println("Print");
        numberList.stream().forEach(n -> System.out.println(n));

        System.out.println("\nPrint using method reference");
        numberList.stream().forEach(System.out::println);

        System.out.println("\nEven filter");
        numberList.stream().filter(n -> (n % 2) == 0).forEach(System.out::println);

        System.out.println("\nFilter and Sqaure Map");
        numberList.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(System.out::println);

        System.out.println("\nSort, Distinct and Collect");
        List<Integer> sortedlist = numberList.stream().sorted().distinct().toList();
        System.out.println(sortedlist);

        System.out.println("\nRange and Sum");
//        Stream.of(10,20,30).mapToInt(x->x).sum();
        System.out.println(IntStream.range(1, 5).sum()); //start incl end excl

        System.out.println("\nSum - using reduce");
        System.out.println(numberList.stream().reduce(0, (a, b) -> a + b));

        System.out.println("\nOptional Usage");
        OptionalInt maxInList = numberList.stream().mapToInt(x -> x).max();
        if (maxInList.isPresent())
            System.out.print(maxInList.getAsInt());

        //IntStream.range(1,10).boxed() Opposite of mapToInt()

        System.out.println("\nCustom Comparator - sort using length");
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(20, 75, "a"));
        studentArrayList.add(new Student(25, 60, "aa"));
        System.out.println(studentArrayList.stream().max(Comparator.comparingInt(s -> s.name.length())).get());

        System.out.println("\nLazy Pipeline");
        System.out.println(IntStream.iterate(1, i -> i + 1).skip(10).filter(n -> n % 2 != 0).findFirst().orElse(-1));


    }
}
