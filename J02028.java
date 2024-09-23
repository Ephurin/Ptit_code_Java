import java.util.Scanner;

public class J02028{
    public static Scanner sc = new Scanner(System.in);
    
    public static int binary_search(int i, int j, long n, long[] a) {
        int left = i;
        int right = j;
        while(left <= right){
            int mid = (left + right) / 2;
            if (a[mid] == n) return mid;
            else if (a[mid] > n){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void solve() {
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n + 1];
        long[] prefix_sum = new long[n + 1];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        prefix_sum[0] = 0;
        for (int i = 1; i <= n; i++){
            prefix_sum[i] = prefix_sum[i - 1] + a[i - 1];
        }

        for (int i = 0; i < n + 1; i++){
            if(binary_search(i + 1, n, prefix_sum[i] + k, prefix_sum) != -1){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}