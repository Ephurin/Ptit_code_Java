import java.util.Scanner;

public class J01013{

    public static Scanner sc = new Scanner(System.in);
    public static int[] min_divisor = new int[2000005];
    public static long ans = 0L;

    public static void prep() {
        min_divisor[0] = 1;
        min_divisor[1] = 1;
        for (int i = 2; i * i <= 2000000; i++){
            if (min_divisor[i] == 0){
                for (int j = i + i; j <= 2000000; j += i){
                    if(min_divisor[j] == 0){
                        min_divisor[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= 2000000; i++){
            if (min_divisor[i] == 0){
                min_divisor[i] = i;
            }
        }
    }

    public static void solve(){
        int n = sc.nextInt();
        while(n > 1){
            ans += min_divisor[n];
            n /= min_divisor[n];
        }
    }

    public static void main(String[]args){
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
        System.out.println(ans);
    }
}