import java.util.Scanner;
import java.util.Arrays;

public class test2{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        int[] a = new int[1001];
        for (int i = 0; i < n; i++){
            a[sc.nextInt()] = 1;
        }  
        for (int i = 0; i < 1001; i += 2){
            if (a[i] == 1) System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 999; i >= 1; i -= 2){
            if (a[i] == 1) System.out.print(i + " ");
        } 
        System.out.println();
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while (t-- > 0){
            solve();
        }
    }
}