import java.util.Scanner;

public class J02024{
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[20];
    public static boolean isOK = true;

    public static void prep() {
        isOK = true;
        for (int i = 0; i <= 15; i++){
            a[i] = 0;
        }
    }

    public static boolean sum_is_odd(int n,int[] b) {
        int summ = 0;
        for (int i = 1; i <= n; i++){
            if (a[i] == 1){
                summ += b[i];
            }
        }

        return summ % 2 == 1;
    }

    public static void next(int n) {
        int i = n;
        while(a[i] == 1){
            a[i] = 0;
            i--;
        }
        if(i == 0) isOK = false;
        else a[i] = 1;
    }

    public static void print(int n, int[] b) {
        for (int i = 1; i <= n; i++){
            if(a[i] == 1){
                System.out.print(b[i] + " ");
            }
        }
        System.out.println();
    }

    public static void solve() {
        prep();
        int n = sc.nextInt();
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                if (b[j] < b[i]){
                    int tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }
        while(isOK) {
            if (sum_is_odd(n, b)){
                print(n, b);
            }
            next(n);
        }
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while (t-- > 0){
            solve();
        }
    }
}