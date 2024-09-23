import java.util.Scanner;
import java.lang.Math;

public class J01005{

    public static Scanner sc = new Scanner(System.in);

    public static void solve(int n, int h){
        for (double i = 1d; i < n; i++){
            System.out.print(String.format("%.6f ", Math.sqrt(i / n) * h));
        }
        System.out.println();
    }

    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int h = sc.nextInt();
            solve(n, h);
        }
    }
}