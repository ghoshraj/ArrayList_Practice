package arraylist;

import java.util.ArrayList;

public class PairSum {
    public static void sum(ArrayList<Integer>list , int target){
        //1st approach
        int i = 0;
        int j = list.size() - 1;
        while (i < j){
            if (list.get(i) + list.get(j) == target) {
                System.out.print(i + "," + j);
                break;
            }
            else if (list.get(i) + list.get(j) < target)
                i++;
            else
                j--;
        }
        //2nd approach
//        for (int i = 1; i < list.size(); i++){
//            for (int j = i + 1; j < list.size(); j++){
//                if (list.get(i) + list.get(j) == target)
//                    System.out.print(i + "," + j);
//            }
//        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        sum(list,target);
    }
}
