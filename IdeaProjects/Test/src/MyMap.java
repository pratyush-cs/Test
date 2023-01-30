import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Map immuMap = Map.of("A",1,"B",2);
        HashMap hm = new HashMap(Map.of("A",1,"B",2));


//        System.out.println(immuMap.get("A"));
//        System.out.println(immuMap.containsKey("A"));
//        System.out.println(immuMap.keySet());
//        System.out.println(immuMap.entrySet());
//
//        System.out.println(hm);
//        System.out.println(hm.put("B",3));
//        System.out.println(hm);
//        System.out.println("\n\n");
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("A",1);
        lhm.put("B",2);
        //System.out.println(lhm);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("A",1);
        tm.put("B",2);
        tm.put("A",3);
        tm.put("Z",4);
        tm.put("X",1);
        //System.out.println(tm);//sorted by keys

        String s = "aabccc";
        countCharOccurence(s);


    }

    public static void countCharOccurence(String s){
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> occurences = new HashMap<>();
        for (char c : charArray){
//            if (occurences.get(c)==null){
//                occurences.put(c,1);
//            }
//            else {
//                int oldCount = occurences.get(c);
//                occurences.put(c,oldCount+1);
//            }

            occurences.put(c, occurences.getOrDefault(c,0)+1);
        }
        System.out.println(occurences);
    }
}
