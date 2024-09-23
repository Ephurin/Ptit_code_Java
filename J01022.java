import java.util.Scanner;

public class J01022{
    public static Scanner sc = new Scanner(System.in);

    public static long[] fibo = new long[100];

    public static void prep() {
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < 100; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static char ans(int n, long k) {
        if (n == 1){
            return '0';
        }
        if (n == 2){
            return '1';
        }
        if (k <= fibo[n - 2]){
            return ans(n - 2, k);
        }
        return ans(n - 1, k - fibo[n - 2]);
    }

    public static void main(String[]args) {
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(ans(n, k));
        }
    }
}