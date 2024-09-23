import java.util.Scanner;
import java.math.BigInteger;

public class J03014{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.add(b);
        System.out.println(c.toString());
    }

    public static void main(String[]args) {
        int t = 1;
        while(t-- > 0){
            solve();
        }
    }
}