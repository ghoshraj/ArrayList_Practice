package arraylist;

import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentNumber {
    public static void mostfrequent(ArrayList<Integer>list , int key){
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < list.size(); i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0) + 1);
        }
        for (Integer nums : map.keySet()){
            if (map.get(nums) >= key)
                System.out.println(nums);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        int key = 2;
        mostfrequent(list,key);
    }
}
