package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxElement {
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
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (max < list.get(i))
                max = list.get(i);
        }
        System.out.println(max);
    }
}
