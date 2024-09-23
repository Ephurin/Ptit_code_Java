import java.util.Scanner;

public class J03032{
    public static Scanner sc = new Scanner(System.in);

    public static String reverse(String s){
        String tmp = "";
        for (int i = 0; i < s.length(); i++){
            tmp = s.charAt(i) + tmp;
        } 
        return tmp;
    }

    public static void solve() {
        String[] s = sc.nextLine().trim().split("\\s+");
        for (String i : s){
            System.out.print(reverse(i) + " ");
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