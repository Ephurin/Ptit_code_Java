import java.util.Scanner;
import java.math.BigInteger;

public class J03039{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.remainder(b);
        BigInteger d = b.remainder(a);
        if (c.toString().equals("0") || d.toString().equals("0")){
            System.out.println("YES");
        } 
        else System.out.println("NO");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}