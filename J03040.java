import java.util.Scanner;

public class J03040{

    public static Scanner sc = new Scanner(System.in);

    public static boolean check(String s) {
        if (s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)) return true;
        if (s.charAt(5) == s.charAt(6) && s.charAt(6) == s.charAt(7) && s.charAt(9) == s.charAt(10)) return true;
        return false;
    }

    public static boolean check_locphat(String s) {
        for (int i = 5; i <= 10; i++){
            if (i == 8) continue;
            else if(s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }

    public static void solve() {
        String s = sc.nextLine();
        if (check(s) || check_locphat(s)) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}