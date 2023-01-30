import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jan16 {
    static int y;
    public static void main(String[] args) {
//        Sqaure s = new Sqaure();
//        System.out.println(s.width);
//        System.out.println("Hello world!");
//        int x = 4;
//        System.out.println(y);
//        String name = "Dirk";
//        System.out.println("x is " + x);
//        double d = Math.random();
//        System.out.println(d);
//
//        while (x > 3) {
//            System.out.println("hi");
//            x--;
//        }
//
//        String[] wordListOne = {"a", "b", "c"};
//        String[] wordListTwo = {"1", "2", "3", "4"};
//        String[] wordListThree = {"@", "#", "$", "-", "_"};
//
//        int oneLength = wordListOne.length;
//        int twoLength = wordListTwo.length;
//        int threeLength = wordListThree.length;
//
//        double randOne = (Math.random() * oneLength);
//        double randTwo = (Math.random() * twoLength);
//        double randThree = (Math.random() * threeLength);
//
//        int r1 = (int) randOne;
//        int r2 = (int) randTwo;
//        int r3 = (int) randThree;
//
//        System.out.println(randOne + " " + randTwo + " " + randThree);
//        System.out.println(r1 + " " + r2 + " " + r3);
//        System.out.println("Phrase: " + wordListOne[r1] + " " + wordListTwo[r2] + " " + wordListThree[r3]);

        Integer i = new Integer(10);

        ArrayList<Integer> ar = new ArrayList<>(10);
        ar.add(1);



        int a = 5;
        Integer a1 = 5;
        Integer a2 = 5;
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

        Customer c1 = new Customer(1,null);
        Customer c2 = new Customer(1,null);

        System.out.println(c1==c2);




    }

    static String getUserInput(){
        String inputLine = null;
        Scanner s = new Scanner(System.in);
        inputLine = s.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = br.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inputLine;
    }
}

class Sqaure{
    int width;
}