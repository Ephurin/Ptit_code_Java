import java.math.BigInteger;
import java.util.Scanner;

public class J03013{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = A.subtract(B).abs();
        StringBuilder ans = new StringBuilder(C.toString());
        int k = Math.max(A.toString().length(), B.toString().length());
        while(ans.length() < k){
            ans.insert(0, '0');
        }
        System.out.println(ans.toString());
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}