import java.util.Scanner;
import java.lang.Math;

public class J01014 {

    public static Scanner sc = new Scanner(System.in);

    public static boolean prime(long n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n >= 2;
    }

    public static void solve() {
        long n = sc.nextLong();
        long ans = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                if (prime(i) && i > ans){
                    ans = i;
                }
                if (prime(n / i) && (n / i) > ans){
                    ans = n / i;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}