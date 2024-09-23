import java.util.Scanner;

public class J01007{

    public static Scanner sc = new Scanner(System.in);
    public static long[] fibo = new long[100];     
    
    public static void prep(){
        fibo[0] = 0L;
        fibo[1] = 1L;
        for (int i = 2; i <= 99; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static void solve(){
        long n = sc.nextLong();
        int isOK = 1;
        for (int i = 0; i <= 99; i++){
            if (n == fibo[i]){
                System.out.println("YES");
                isOK = 0;
                break;
            }
            else if (n < fibo[i]){
                System.out.println("NO");
                isOK = 0;
                break;
            }
        }
        if (isOK == 1){
            System.out.println("NO");
        }
    }

    public static void main(String[]args) {
        prep();
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}