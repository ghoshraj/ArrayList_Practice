package arraylist;

import java.util.ArrayList;

public class Sorted_And_Rotated_Arraylist_SumPair {
    public static void sum(ArrayList<Integer>list,int target){
        int rightpointer = 0;
        int leftpointer = 0;
        int size = list.size();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > list.get(i + 1)){
                rightpointer = i + 1;
                leftpointer = i;
                break;
            }
        }
        while (leftpointer != rightpointer){
            int sum = list.get(leftpointer) + list.get(rightpointer);
            if (sum == target){
                System.out.println(leftpointer + "," + rightpointer);
                break;
            }
            else if(sum < target){
                rightpointer = (rightpointer + 1) % size;
            }
            else {
                leftpointer = (size + leftpointer - 1) % size;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        sum(list,target);
    }
}
