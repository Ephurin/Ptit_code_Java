import java.util.Scanner;

public class J03008{
    public static Scanner sc = new Scanner(System.in);

    public static String reverse(String s) {
        String k = "";
        for (int i = 0; i < s.length(); i++){
            k = s.charAt(i) + k;
        }
        return k;
    }

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                return false;
            }
        }
        return true;
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