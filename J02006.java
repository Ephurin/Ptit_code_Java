import java.util.Scanner;

public class J02006{
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        int n = sc.nextInt() + sc.nextInt();
        int[] a = new int[n];
        int[] f = new int[1005];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            f[a[i]] = 1;
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
            if (f[a[i]] == 1){
                System.out.print(a[i] + " ");
                f[a[i]] = 0;
            }
        }
    }

    public static void main(String[]args) {
        solve();
    }
}