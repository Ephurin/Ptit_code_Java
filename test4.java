import java.util.Scanner;

public class test4{
    public static Scanner sc = new Scanner(System.in);

    public static long[] min_divisor = new long[2000005];
    public static long ans = 0L;

    public static void prep() {
        min_divisor[0] = min_divisor[1] = 1;
        for (int i = 2; i <= Math.sqrt(2000005); i++){
            if (min_divisor[i] == 0){
                min_divisor[i] = i;
                for (int j = i + i; j <= Math.sqrt(2000005); j += i){
                    min_divisor[j] = i;
                } 
            }
        }
        for (int i = 2; i < 2000005; i ++) {
            if (min_divisor[i] == 0){
                min_divisor[i] = i;
            }
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        while(min_divisor[n] != 1){
            ans += min_divisor[n];
            n /= min_divisor[n];
        }
    }

    public static void main(String[]args) {
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
        System.out.println(ans);
    }
}