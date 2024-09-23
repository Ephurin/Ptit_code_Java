import java.util.Scanner;

public class J01025{

    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int maxx = 0;
        int maxy = 0;
        int minx = 1000;
        int miny = 1000;
        for (int i = 0; i < 4; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (maxx < a){
                maxx = a;
            }
            if (maxy < b){
                maxy = b;
            }
            if (minx > a){
                minx = a;
            }
            if (miny > b){
                miny = b;
            }
        }
        int x = maxx - minx;
        int y = maxy - miny;
        if (x < y){
            x = y;
        }
        System.out.println(x * x);
    }

    public static void main(String[]args) {
        solve();
    }

}