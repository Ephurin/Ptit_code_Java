import java.util.Scanner;

public class J01009{

    public static Scanner sc = new Scanner(System.in);
    public static long[] a = new long[21];
    public static long[] sum = new long[21];

    public static void prep(){
        a[0] = 1L;
        for (int i = 1; i < 21; i++){
            a[i] = a[i - 1] * i;
        }
        sum[0] = 1L;
        sum[1] = 1L;
        for (int i = 2; i < 21; i++){
            sum[i] = sum[i - 1] + a[i];
        }
    }

    public static void main(String[]args){
        prep();
        int n = sc.nextInt();
        System.out.println(sum[n]);
    }
}