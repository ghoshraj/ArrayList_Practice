package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Two_D_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();

        ArrayList<Integer>list1 = new ArrayList<>();
        System.out.print("Enter the number : ");
        list1.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list1.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list1.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list1.add(sc.nextInt());
        mainlist.add(list1);

        ArrayList<Integer>list2 = new ArrayList<>();
        System.out.print("Enter the number : ");
        list2.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list2.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list2.add(sc.nextInt());
        System.out.print("Enter the number : ");
        list2.add(sc.nextInt());
        mainlist.add(list2);
        for (int i = 0; i < mainlist.size(); i++){
            ArrayList<Integer>currlist = mainlist.get(i);
            for (int j = 0 ;j < currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
