import java.util.Scanner;

public class J03005{

    public static Scanner sc = new Scanner(System.in);

    public static String conv(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void solve() {
        String s = sc.nextLine().trim();
        String[] sp = s.split("\\s+");
        for(int i = 1; i < sp.length; i++){
            System.out.print(conv(sp[i]));
            if (i < sp.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println(", " + sp[0].toUpperCase());
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}