import java.math.BigInteger;
import java.util.Scanner;

public class J03015{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = A.subtract(B);
        StringBuilder ans = new StringBuilder(C.toString());
        System.out.println(ans.toString());
    }

    public static void main(String[]args) {
        int t = 1;
        while(t-- > 0){
            solve();
        }
    }
}