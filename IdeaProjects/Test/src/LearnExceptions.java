import java.io.File;
import java.util.Scanner;

public class LearnExceptions {
    public static void main(String[] args) {
        //method1();
//        try {
//            throw new MyException("Test");
//        } catch (MyException e) {
//            e.printStackTrace();
//        }
//        finally {
//            throw new MyRuntimeException("Failure");
//        }
        System.err.println("hi");
        throw new UnknownError();

    }

    static void method1() {
        method2();
    }

    static void method2() {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            //e.printStackTrace();
            System.err.println("hi");
        }
    }
}

class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(String msg){
        super(msg);
    }
}
