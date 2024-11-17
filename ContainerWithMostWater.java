package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ContainerWithMostWater {
    public static int StoredWater(ArrayList<Integer>list){
        int maxwater = 0;
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size(); j++){
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = height * width;
                maxwater = Math.max(water,maxwater);
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list.add(sc.nextInt());

        System.out.println(StoredWater(list));
    }
}
