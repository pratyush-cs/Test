import java.util.Scanner;

public class ExecTryWithResources {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            String s = scanner.nextLine();
        }
    }
}
