import java.util.Scanner;
import java.util.Arrays;

public class J08015 {
    public static Scanner sc = new Scanner(System.in);

    public static int firstOccurrence(long[] a, int n, long x, int l, int r){
        int res = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(a[mid] == x){
                res = mid;
                r = mid - 1;
            }
            else if(a[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }

    public static int lastOccurrence(long[] a, int n, long x, int l, int r){
        int res = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(a[mid] == x){
                res = mid;
                l = mid + 1;
            }
            else if(a[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return res;
    }

    public static void solve(){
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for(int i = 0; i<n; i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        int res = 0;
        for (int i = 0; i < n - 1; i++){
            long x = k - a[i];
            int l = firstOccurrence(a, n, x, i + 1, n - 1);
            int r = lastOccurrence(a, n, x, i + 1, n - 1);
            if(l != -1 && r != -1) res += r - l + 1;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-->0) solve();
    }
}
