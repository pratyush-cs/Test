import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class CharIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader("1.txt");
        FileInputStream fileInputStream = new FileInputStream("1.txt");
//        File f = new File("LearnGenerics.class");
//        byte[] bytes = Files.readAllBytes(Paths.get("LearnGenerics.class"));


//        FileWriter fileWriter = new FileWriter("/Users/pratyushsharma/IdeaProjects/Test/1.txt");
//        fileWriter.append("Sharma123");
//        fileWriter.flush();

//        int i = 1;
//        while ((i= fileReader.read())>0) {
//            System.out.print((i+" "));
//        }
//        System.out.println("---");
//        i = 1;
//        while ((i= fileInputStream.read())>0) {
//            System.out.print((i+" "));
//        }
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("1.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}


//    static Boolean isJavaClassFile(String fileName) throws IOException {
//        String magic = "cafebabe";
//        Byte[] magicArr = {0xC,0xA,0xF,0xE,0xB,0xA,0xB,0xE};
//
//        System.out.println(magicArr.length);
//        FileInputStream fileInputStream = new FileInputStream(fileName);
//        byte[] fileArr8 = fileInputStream.readNBytes(8);
//
//        int compare = (Arrays.compare(magicArr, fileArr8));
//        System.out.println("magicarr " + Arrays.toString(magicArr));
//        for (byte b : fileArr8){
//            System.out.print((b & 0xFF)+" ");
//        }
//        System.out.println("comp - " + compare);
//        if (compare == 0) return true;
//        return false;
//    }

