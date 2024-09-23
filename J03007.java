import java.util.Scanner;

public class J03007{
    public static Scanner sc = new Scanner(System.in);

    public static String reverse(String s) {
        String k = "";
        for (int i = 0; i < s.length(); i++){
            k = s.charAt(i) + k;
        }
        return k;
    }

    public static boolean check(String s) {
        if (s.charAt(0) != '8') return false;
        if (reverse(s).charAt(0) != '8') return false;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++){
            cnt = cnt + s.charAt(i) - '0';
        }
        if (cnt % 10 == 0) return true;
        return false;
    }

    public static void solve() {
        String s = sc.nextLine();
        if (s.equals(reverse(s)) && check(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}