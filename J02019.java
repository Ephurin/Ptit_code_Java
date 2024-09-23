import java.util.Scanner;

public class J02019{
    public static Scanner sc = new Scanner(System.in);
    public static int[] min_divisor = new int[1000005];

    public static void prep() {
        min_divisor[1] = 1;
        min_divisor[0] = 1;
        for (int i = 2; i <= 1000000; i++){
            min_divisor[i] = i;
        }
        for (int i = 2; i * i <= 1000000; i++){
            if (min_divisor[i] == i){
                for (int j = i + i; j <= 1000000; j += i){
                    min_divisor[j] += i;
                }
            }
        }
    }

    public static boolean valid(int n) {
        if (min_divisor[n] > 2*n){
            return true;
        }
        return false;
    }

    public static void main(String[]args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        prep();
        int cnt = 0;
        for (int i = n; i <= m; i++){
            if (valid(i)) cnt++;
        }
        System.out.println(cnt);
    }
}