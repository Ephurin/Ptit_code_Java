import java.util.Scanner;

public class J02022{
    public static Scanner sc = new Scanner(System.in);

    public static boolean[] visited = new boolean[11];
    public static int[] a = new int[11];

    public static void prep() {
        for (int i = 1; i <= 9; i++){
            visited[i] = false;
        }
        for (int i = 0; i < 10; i++){
            a[i] = 0;
        }
    }
    
    public static boolean check(int[] a, int n) {
        for (int i = 0; i < n - 1; i++){
            if (a[i] == a[i + 1] - 1 || a[i] == a[i + 1] + 1) return false;
        }
        return true;
    }

    public static void printt(int[] a, int n) {
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }   
        System.out.println();
    }

    public static void Try(int i, int n, int[] a){
        if (i >= n){
            if (check(a, n)){
                printt(a, n);
            }
            return;
        }
        for (int j = 1; j <= n; j++){
            if (visited[j] == false){
                a[i] = j;
                visited[j] = true;
                Try(i + 1, n, a);
                visited[j] = false;
                a[i] = 0;
            }
        }
    }

    public static void solve() {
        prep();
        int n = sc.nextInt();
        Try(0, n, a);
    }

    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}