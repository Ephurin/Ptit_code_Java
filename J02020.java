import java.util.Scanner;

public class J02020{
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[11];
    public static boolean isOK = false;

    public static void sinh(int n,int k, int[] a) {
        int i = k;
        while(i > 0 && a[i] == n - k + i){
            i--;
        }
        if (i == 0) isOK = true;
        else{
            a[i]++;
            for (int j = i + 1; j <= k; j++){
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void prep(int k) {
        for (int i = 1; i <= k; i++){
            a[i] = i;
        }
    }

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        prep(k);
        while(!isOK){
            for (int i = 1; i <= k; i++){
                System.out.print(a[i] + " ");
            }
            sinh(n, k, a);
            cnt++;
            System.out.println();
        }
        System.out.println("Tong cong co " + cnt + " to hop");
    }

    public static void main(String[]args) {
        solve();
    }
}