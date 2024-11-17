package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapTwoNumber {
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
        System.out.print("Enter index1 : ");
        int index1 = sc.nextInt();
        System.out.print("Enter index2 : ");
        int index2 = sc.nextInt();
        int temp1 = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp1);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
