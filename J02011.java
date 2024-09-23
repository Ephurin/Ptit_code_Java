import java.util.Scanner;

public class J02011{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++){
            int min = a[i];
            int mark = i;
            for (int j = i; j < n; j++){
                if (a[j] < min){
                    mark = j;
                    min = a[j];
                }
            }
            int tmp = a[i];
            a[i] = a[mark];
            a[mark] = tmp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}