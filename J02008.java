import java.util.Scanner;

public class J02008{
    public static Scanner sc = new Scanner(System.in);
    public static long[] LCM_to = new long[105];

    public static long GCD(long a, long b) {
        if (b == 0){
            return a;
        }
        return GCD(b, a % b);
    }

    public static long LCM(long a, long b) {
        return a * b / GCD(a, b);
    }

    public static void prep() {
        LCM_to[1] = 1;
        for (int i = 2; i <= 100; i++){
            LCM_to[i] = LCM(LCM_to[i - 1], i);
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        System.out.println(LCM_to[n]);
    }

    public static void main(String[]args) {
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}