import java.util.Scanner;

public class J03011{
    public static Scanner sc = new Scanner(System.in);

    public static long GCD(long a, long b){
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    public static void solve() {
        long a = sc.nextLong();
        sc.nextLine();
        String b = sc.nextLine();
        long k = 0;
        for (int i = 0; i < b.length(); i++){
            k = k * 10 + (b.charAt(i) - '0');
            k %= a;
        }
        System.out.println(GCD(a, k));
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}