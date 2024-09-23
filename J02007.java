import java.util.Scanner;

public class J02007{
    public static Scanner sc = new Scanner(System.in);

    public static int[] cnt = new int[100005];

    public static void solve(int x) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        System.out.println("Test " + x + ":");
        for (int i = 0; i < n; i++){
            if (cnt[a[i]] != 0){
                System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                cnt[a[i]] = 0;
            }
        }
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        int x = 0;
        while(x++ < t){
            solve(x);
        }
    }
}