import java.util.Scanner;

public class J02026{
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[20];
    public static boolean isOK = true;

    public static void prep(int n){
        for (int i = 1; i <= n; i++){
            a[i] = i;
        }
        isOK = true;
    }

    public static void next(int n, int k) {
        int i = k;
        while(i > 0 && a[i] == i - k + n){
            i--;
        }
        if (i == 0) isOK = false;
        else{
            a[i]++;
            for (int j = i + 1; j <= n; j++){
                a[j] = a[j - 1] + 1;
            }
        }
    }

    public static void printt(int n, int[] b) {
        for (int i = 1; i <= n; i++){
            System.out.print(b[a[i]] + " ");
        }
        System.out.println();
    }

    public static void solve() {
        int n = sc.nextInt();
        int k = sc.nextInt();
        prep(k);
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                if (b[i] < b[j]){
                    int tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }
        while(isOK){
            printt(k, b);
            next(n, k);
        }
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}