import java.util.Scanner;
import java.util.ArrayList;

public class J03010{
    public static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> ar = new ArrayList<String>();

    public static boolean is_in_ar(String s) {
        for (int i = 0; i < ar.size(); i++){
            if (s.equals(ar.get(i))){
                return true;
            }
        }
        return false;
    }

    public static void solve() {
        String sp = sc.nextLine().trim();
        String[] s = sp.split("\\s+");

        String ans2 = "@ptit.edu.vn";
        String ans1 = "";

        for (int i = 0; i < s.length; i++){
            s[i] = s[i].toLowerCase();
        }

        for (int i = s.length - 2; i >= 0; i--){
            ans1 = s[i].charAt(0) + ans1;
        }
        ans1 = s[s.length - 1] + ans1;
        int cnt = 2;
        if (!is_in_ar(ans1)){
            ar.add(ans1);
            System.out.println(ans1 + ans2);
            return;
        }
        while(is_in_ar(String.format("%s%d", ans1, cnt))){
            cnt++;
        }
        ar.add(String.format("%s%d", ans1, cnt));
        System.out.println(String.format("%s%d%s", ans1, cnt, ans2));
    }
    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}