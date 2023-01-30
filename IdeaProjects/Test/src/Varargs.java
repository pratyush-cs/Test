import java.util.ArrayList;
import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArray(1,2,3,4,5,6)));

    }

    static int[] getArray(int... values){
        System.out.println(values.getClass());
        return values;
    }

}
