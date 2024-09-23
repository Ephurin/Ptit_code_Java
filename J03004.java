import java.util.Scanner;

public class J03004{

    public static Scanner sc = new Scanner(System.in);

    public static String conv(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void solve() {
        String s = sc.nextLine().trim();
        String[] sp = s.split("\\s+");
        for(String i : sp){
            if (i != "") System.out.print(conv(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}