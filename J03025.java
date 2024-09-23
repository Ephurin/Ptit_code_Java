import java.util.Scanner;

public class J03025{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
                cnt++;
            } 
        }
        if (s.length() % 2 == 0){
            if (cnt == 1) System.out.println("YES");
            else System.out.println("NO");
        }
        else{
            if (cnt == 0 || cnt == 1) System.out.println("YES");
            else System.out.println("NO");
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