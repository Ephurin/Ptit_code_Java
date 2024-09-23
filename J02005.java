import java.util.Scanner;

public class J02005{
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] f = new int[1005];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            f[a[i]] = 1;
        }
        for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
            if (f[b[i]] == 1) f[b[i]] = 2;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (a[j] > a[i]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++){
            if (f[a[i]] == 2){
                System.out.print(a[i] + " ");
                f[a[i]] = 0;
            }
        }
    }

    public static void main(String[]args) {
        solve();
    }
}