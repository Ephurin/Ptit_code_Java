import java.util.Scanner;
import java.util.ArrayList;

public class J02105{

    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
        ar.add(new ArrayList<Integer>());
        
        for (int i = 1; i <= n; i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            for (int j = 1; j <= n; j++){
                if(sc.nextInt() == 1) tmp.add(j);
            }
            ar.add(tmp);
        }

        int cnt = 0;

        for (ArrayList<Integer> i : ar){
            if (cnt == 0){
                cnt++;
                continue;
            }
            System.out.print("List(" + cnt + ") = ");
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
            cnt++;
        }
    }

    public static void main(String[]args) {
        solve();
    }
}