import java.util.Scanner;

public class J01008{

    public static Scanner sc = new Scanner(System.in);

    public static void solve(int x){
        int n = sc.nextInt();
        int k = 2;
        System.out.print("Test " + (x) + ": ");
        while(n >= k){
            int cnt = 0;
            while(n % k == 0){
                cnt++;
                n /= k;
            }
            if(cnt > 0){
                System.out.print(k + "(" + cnt + ") ");
            }
            k++;
        }
        System.out.println();
    }

    public static void main(String[]args){
        int t = sc.nextInt();
        int x = 1;
        while(t-- > 0){
            solve(x);
            x++;
        }
    }
}