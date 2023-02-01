import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class nio {
    public static void main(String[] args) throws IOException {
        //Files.list(Paths.get(".")).forEach(System.out::println);
        //Files.walk(Paths.get("."),4).filter(path->String.valueOf(path).contains(".java")).forEach(System.out::println);
        Path path = Paths.get("1.txt");
        List<String> lines = Files.readAllLines(path);
        //System.out.println(lines);
        Files.lines(path).forEach(System.out::println);
        Files.write(path,List.of("Hello","World"));

        String s = "PRATYUSH\nSharma";
        Stream.of(s).forEach(System.out::print);
        System.out.println();
        s.lines().forEach(System.out::print);
    }

}
