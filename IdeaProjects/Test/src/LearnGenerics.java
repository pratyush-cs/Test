import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LearnGenerics {

    public static void main(String[] args) {
        /*NumberKeyMap<Integer, String> numberKeyMap2 = new NumberKeyMap<Integer, String>(); */
        NumberKeyMap<Number, Integer> numberKeyMap = new NumberKeyMap<>();

        numberKeyMap.addPair(Integer.MAX_VALUE,1);

        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(Integer.MAX_VALUE);

        System.out.println(numberKeyMap);

        int max = printAndReturnValue(Integer.MAX_VALUE);

        System.out.println(sumOfList(List.of(1, 2, 3, 4, 5)));
        System.out.println(doubleTheValuesInList(new ArrayList<>(List.of(1, 2, 3))));

        shout("Hello",1);
    }

    //Generic Function
    static <X> X printAndReturnValue(X value) {
        System.out.println(value);
        return value;
    }

    //Upper bounded wlid card
    static Double sumOfList(List<? extends Number> numberList) {
        double sum = 0.0;
        for (Number n : numberList) {
            sum += n.doubleValue();
        }
        return sum;
    }

    //Lower bounded wild card
    static List doubleTheValuesInList(List<? super Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (((Integer) list.get(i)) * 2));
        }
        return list;
    }

    static <T, V> void shout(T t, V v) {
        System.out.println(t.toString() + v.toString());
    }


}

class NumberKeyMap<T, V extends Number & Serializable> {
    HashMap<T, V> hashMap = new HashMap<>();

    public void addPair(T t, V v) {
        hashMap.put(t, v);
    }

    @Override
    public String toString() {
        return hashMap.toString();
    }
}