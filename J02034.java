import java.util.Scanner;
import java.lang.Math;

public class J02034{
    public static Scanner sc = new Scanner(System.in);
    public static int[] a = new int[205];

    public static void main(String[]args) {
        int n = sc.nextInt();
        int maxx = 0;
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            a[tmp] = 1;
            maxx = Math.max(maxx, tmp);
        }
        int isOK = 0;
        for (int i = 1; i <= maxx; i++){
            if (a[i] == 0){
                System.out.println(i);
                isOK = 1;
            }
        }
        if (isOK == 0){
            System.out.println("Excellent!");
        }
    }
}