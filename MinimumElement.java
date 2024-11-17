package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumElement {
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
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (min > list.get(i))
                min = list.get(i);
        }
        System.out.println(min);
    }
}
