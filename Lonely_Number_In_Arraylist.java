package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class Lonely_Number_In_Arraylist {
    public static ArrayList<Integer> lonely(ArrayList<Integer> list){
        ArrayList<Integer>finallist = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0; i < list.size(); i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0) + 1);
        }
        for (int i = 0; i < list.size(); i++){
            if (map.get(list.get(i)) == 1 && !map.containsKey(list.get(i) + 1) && !map.containsKey(list.get(i) - 1))
                finallist.add(list.get(i));
        }
          return finallist;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        System.out.println(lonely(list));
    }
}
