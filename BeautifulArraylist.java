package arraylist;

import java.util.ArrayList;

public class BeautifulArraylist {
    public static ArrayList<Integer>list(int n){
        ArrayList<Integer>ans = new ArrayList<>();
        for (int i = 1; i <= n; i+=2)
            ans.add(i);
        for (int i = 2; i <= n; i+=2)
            ans.add(i);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(list(n));
    }
}
