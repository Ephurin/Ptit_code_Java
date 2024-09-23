import java.util.Scanner;

public class J02106{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++){
            int tmp = 0;
            for (int j = 0; j < 3; j++){
                int tmpp = sc.nextInt();
                if (tmpp == 1){
                    tmp++;
                }
            }
            if (tmp >= 2){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}