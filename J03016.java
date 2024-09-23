import java.util.Scanner;

public class J03016{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        String s = sc.nextLine();
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0) evenCount += (s.charAt(i) - '0');
            else oddCount += (s.charAt(i) - '0');
        }

        if ((oddCount - evenCount) % 11 == 0) System.out.println(1);
        else System.out.println(0);
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}