import java.util.Scanner;

public class J01006{

    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[93];     
    
    public static void prep(){
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 92; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void solve(){
        int n = sc.nextInt();
        System.out.println(fibo[n]);
    }

    public static void main(String[]args) {
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}