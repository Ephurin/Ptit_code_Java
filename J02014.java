import java.util.Scanner;

public class J02014{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] prefix_sum = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        prefix_sum[0] = a[0];
        for (int i = 1; i < n; i++){
            prefix_sum[i] = prefix_sum[i - 1] + a[i];
        }
        for (int i = 1; i < n; i++){
            if (prefix_sum[i - 1] == prefix_sum[n - 1] - prefix_sum[i]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}