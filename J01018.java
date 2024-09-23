import java.util.Scanner;

public class J01018{
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) != s.charAt(i + 1) + 2 && s.charAt(i) != s.charAt(i + 1) - 2){
                System.out.println("NO");
                return;
            }
            sum += (int)(s.charAt(i) - '0');
        }
        sum += (int)(s.charAt(s.length() - 1) - '0');
        if (sum % 10 == 0){
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