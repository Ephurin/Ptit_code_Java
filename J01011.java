import java.util.Scanner;

public class J01011{

    public static Scanner sc = new Scanner(System.in);

    public static long GCD(long a, long b){
        if (b == 0){
            return a;
        }
        return GCD(b, a % b);
    }

    public static long LCM(long a, long b){
        return (a * b) / GCD(a, b); 
    }

    public static void solve(){
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(LCM(a, b) + " " + GCD(a, b));
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}