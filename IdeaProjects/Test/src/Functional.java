import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Functional {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 1, 100, 10));
        //list.stream().forEach(e -> System.out.println(e));
        list.stream().forEach(System.out::println);
        System.out.println("Evens - ");
        list.stream().filter(e -> (e % 2) == 0).forEach(System.out::println);
        System.out.println("Odds-");
        getOddFilter(list).forEach(System.out::println);

        System.out.println("Sum - ");
//        System.out.println(list.stream().reduce(0, (a, b) -> a + b));
        System.out.println(list.stream().reduce(0, (a, b) -> {
            System.out.println(a + "+" + b);
            return a + b;
        }));
        System.out.println("Sort and Distinct");
        list.stream().distinct().sorted().forEach(System.out::println);

        System.out.println("Square of each");
        List sqList = list.stream().map(e -> e * e).toList();
        System.out.println(sqList);

        System.out.println("Square of all no bw 20 and 30");
        IntStream.range(20, 30).map(e -> e * e).forEach(System.out::println);

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(20, 75, "a"));
        studentArrayList.add(new Student(25, 60, "aa"));

        System.out.println(studentArrayList.stream().map(e -> e.name).
                max(Comparator.comparingInt(String::length)));

        System.out.println("Stream to lowercase");
        List.of("Cat", "BAT", "tiger", "lIOn").stream().map(String::toLowerCase).forEach(System.out::println);
        System.out.println("Length sum");
        System.out.println((List.of("").stream().map(String::length).mapToInt(s -> s).sum()));
        System.out.println();
        System.out.println(List.of(1, 2, 3, 4).stream().max(Comparator.comparingInt(o -> o)).get()); //optional to int using get
        OptionalInt oi = IntStream.range(1, 5).max();
        if (oi.isPresent()) {
            System.out.println(oi.getAsInt());
        }
        List<Integer> evenList = Stream.of(1, 2, 3, 4, 5).filter(s -> s % 2 == 0).toList();

        System.out.println(IntStream.range(1, 5).map(e -> e * e).boxed().toList());

        System.out.println("Odd Optional");
        System.out.println(Stream.of(2, 4, 6).peek(System.out::println).filter(e -> e % 2 != 0).mapToInt(s -> s).max().orElse(0));
        System.out.println("hello");
        var x = IntStream.range(0, Integer.MAX_VALUE).peek(System.out::println).filter(s -> s % 2 == 0).findFirst(); //filter is lazy

        System.out.println(IntStream.iterate(0, i -> i + 1).skip(10).limit(10).peek(e -> {
            System.out.print(e + ", ");
        }).average().orElse(0.0));

        Predicate<Integer> predicate = i -> i % 2 == 0;


        boolean anyEven = Stream.of(1, 2, 3, 4, 5).anyMatch(predicate);
        System.out.println(anyEven);

        System.out.println((List.of("").stream().map(String::length).mapToInt(s -> s).sum()));

        System.out.println("\n\n\n");

        List<String> listGFG = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");

        // Using Stream flatMap(Function mapper)
        listGFG.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
        System.out.println("---");
        listGFG.stream().map(s -> s.charAt(2));

        System.out.println("---");
        listGFG.stream().map(str -> Stream.of(str.charAt(2))).forEach(System.out::println);

        var $2dlist = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(6, 7, 8), List.of('a', 'b', 'c'));

        $2dlist.stream().flatMap(Collection::stream).forEach(System.out::println);
        var $3dList = List.of($2dlist, $2dlist);
        System.out.println("----");
        $3dList.stream().flatMap(l->l.stream()).flatMap(l->l.stream()).forEach(System.out::println);

    }

    static Stream<Integer> getOddFilter(List<Integer> list) {
        return list.stream().filter(e -> e % 2 != 0);
    }
}


