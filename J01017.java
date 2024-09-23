import java.util.Scanner;

public class J01017{
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) != s.charAt(i + 1) + 1 && s.charAt(i) != s.charAt(i + 1) - 1){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}