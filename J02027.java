import java.util.Scanner;
import java.util.Arrays;

public class J02027{
    public static Scanner sc = new Scanner(System.in);

    public static int binary_search(int i,int n, int k, int[] a) {
        int left = i;
        int right = n - 1;
        while (left < right){
            int mid = (left + right) / 2;
            if (a[mid] == k){
                while(a[mid] == k){
                    mid--;
                }
                return mid;
            }
            else if (a[mid] < k){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        if (a[left] < k) return left;
        return left - 1;
    }

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long ans = 0;
        for (int i = 0; i < n - 1; i++){
            ans += binary_search(i, n, a[i] + k, a) - i;
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