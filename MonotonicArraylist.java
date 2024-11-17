package arraylist;

import java.util.ArrayList;

public class MonotonicArraylist {
    public static boolean isMonotonic(ArrayList<Integer>list){
        if (list.size() < 1){
            return true;
        }
        boolean increase = true;
        boolean decrease = true;
        for (int i = 0; i < list.size() - 1; i++){
            if (list.get(i) <= list.get(i + 1))
                increase = false;
            if (list.get(i) >= list.get(i + 1))
                decrease = false;
        }
        return increase || decrease;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println(isMonotonic(list));
    }
}
