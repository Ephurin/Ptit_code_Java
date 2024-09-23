import java.util.Scanner;
import java.math.BigInteger;

public class J03033{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger mul = a.multiply(b);
        BigInteger GCD = a.gcd(b);
        BigInteger LCM = mul.divide(GCD);
        System.out.println(LCM);
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}