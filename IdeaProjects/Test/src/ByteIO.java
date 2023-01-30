import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ByteIO {
    public static void main(String[] args) throws IOException {
//        Files.list(Paths.get(".")).forEach(System.out::println);
        FileInputStream inputStream = new FileInputStream("1.txt");
        FileReader fileReader = new FileReader("1.txt");

//        int word;
//        while ((word = fileReader.read()) >0){
//            System.out.print((char) word);
//        }
//        for (int e: inputStream.readAllBytes()) {
//            System.out.print((char)e);
//        }
        byte[] byteArray = inputStream.readAllBytes();

        String s = new String(byteArray);

        int[] intArr = {1,2,3};
        Arrays.stream(intArr).boxed().map(Object::toString).forEach(System.out::println);
        //List.of(intArr).stream().forEach(System.out::println);



        BufferedReader bufferedReader = new BufferedReader(fileReader);
        //bufferedReader.readLine();
    }
}
