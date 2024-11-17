package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
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
        //asending order
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("______________________________");
        //desending order
        Collections.sort(list,Collections.reverseOrder());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
