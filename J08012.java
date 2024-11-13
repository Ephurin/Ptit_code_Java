import java.util.Scanner;

public class J08012 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n - 1; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[b]++;
            arr[a]++;
        }
        for (int i = 0; i <= n; i++){
            if (arr[i] == n - 1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
