import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ByteIO {
    public static void main(String[] args) throws IOException {
//        Files.list(Paths.get(".")).forEach(System.out::println);
        FileInputStream fileInputStream = new FileInputStream("1.txt");

//        int word;
//        while ((word = fileReader.read()) >0){
//            System.out.print((char) word);
//        }
        //fileInputStream.skip(3);

//        fileInputStream.markSupported();
//        fileInputStream.reset();
        FileOutputStream fileOutputStream = new FileOutputStream("1.txt");
        char[] c = new String("Test").toCharArray();
        byte[] cb = new byte[c.length]; int index = 0;
        for (char a : c){
            cb[index] = (byte) a;
            index++;
        }
        fileOutputStream.write(cb);
        fileOutputStream.flush();
        //System.out.println(Arrays.toString(fileInputStream.readAllBytes()));

        for (int e: fileInputStream.readAllBytes()) {
            System.out.print((char)e);
        }

//        String s = new String(byteArray);
//        System.out.println(s);

        int[] intArr = {1,2,3};
        //Arrays.stream(intArr).boxed().map(Object::toString).forEach(System.out::println);
        //List.of(intArr).stream().forEach(System.out::println);

    }
}
