import java.util.Scanner;

public class J02103{

    public static Scanner sc = new Scanner(System.in);

    public static void solve(int x){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Test " + x + ":");
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                b[i][j] = 0;
                for (int k = 0; k < m; k++){
                    b[i][j] += a[i][k] * a[j][k];
                }
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        int x = 0;
        while(x++ < t){
            solve(x);
        }
    }
}