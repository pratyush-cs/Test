import java.util.*;

public class MyList {
    public static void main(String[] args) {
        List<String> stringList = List.of("P", "S");
        //stringList.remove(0); error
        //stringList.add("Z");
        List<String> stringListArrayList = new ArrayList<>();
        stringListArrayList.add("P");
        stringListArrayList.add("S");
        System.out.println(stringList.getClass()); //immuatable collections
        System.out.println(stringListArrayList.getClass()); //arraylist

        Iterator stringListItr = stringList.iterator();
        while (stringListItr.hasNext()) {
            System.out.println(stringListItr.next());
        }
        System.out.println("\n\n");

        List<String> colorList = new ArrayList<>(Arrays.asList("Purple", "Red", "Green", "Blue", "Pink", "Orange", "Purple", "Ee"));


//        for (String color : colorList){
//            if (color.endsWith("e")){
//                colorList.remove(color); //error
//            }
//        }

//        for (int i = colorList.size()-1; i >= 0; i--) {
//            if (colorList.get(i).endsWith("e")) {
//                colorList.remove(i);
//            }
//        }

//        Iterator colorItr = colorList.iterator();
//        while (colorItr.hasNext()){
//            if (colorItr.next().toString().endsWith("e")){
//                colorItr.remove();
//            }
//        }


        List numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4 , 0, 100,200));

        numberList.remove(Integer.valueOf(1));
        numberList.sort((o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof Integer) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                if (i1 > i2) return 1;
                else if (i1 < i2) return -1;
                else return 0;
            }
            return -1;
        });

//        Collections.sort(numberList);

        System.out.println(numberList);

        System.out.println("\n\n");

        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(1,2,3,4));
        al.add(0,0);
        al.set(3,30);
        System.out.println(al);

    }
}
