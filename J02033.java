import java.util.Scanner;
import java.util.Arrays;
public class J02033{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int n = sc.nextInt();
        int k = sc.nextInt() % n;
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (i < k) ans -= a[i];
            else ans += a[i]; 
        }
        System.out.println(ans);
    }
}