import java.util.Scanner;

public class J02012{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sorted[0] = a[0];
        System.out.printf("Buoc 0: %d",sorted[0]);
        System.out.println();
        for (int i = 1; i < n; i++){
            sorted[i] = a[i];
            for(int j = i; j >= 1; j--){
                if (sorted[j - 1] > sorted[j]){
                    int tmp = sorted[j];
                    sorted[j] = sorted[j - 1];
                    sorted[j - 1] = tmp;
                }
            }
            System.out.printf("Buoc %d: ", i);
            for (int j = 0; j <= i; j++){
                System.out.print(sorted[j] + " ");
            }
            System.out.println();
        }
    }
}