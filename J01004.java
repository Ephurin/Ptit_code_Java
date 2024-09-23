import java.lang.Math;
import java.util.Scanner;

public class J01004{

    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return (n >= 2);
    }

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int k = sc.nextInt();
            if (isPrime(k)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}