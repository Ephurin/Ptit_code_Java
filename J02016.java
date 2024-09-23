import java.util.Scanner;

public class J02016{
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
        long[] a = new long[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            a[i] *= a[i];
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (a[j] > a[i]){
                    long tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (binary_search(j + 1, n - 1, a[i] + a[j], a) != -1){
                    System.out.println("YES");
                    return;
                }
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