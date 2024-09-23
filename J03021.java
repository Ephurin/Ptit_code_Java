import java.util.Scanner;

public class J03021{
    public static Scanner sc = new Scanner(System.in);

    public static char conv(char c) {
        if ((c >= 'a' && c <= 'c') || (c >= 'A' && c <= 'C')){
            return '2';
        }
        if ((c >= 'd' && c <= 'f') || (c >= 'D' && c <= 'F')){
            return '3';
        }
        if ((c >= 'g' && c <= 'i') || (c >= 'G' && c <= 'I')){
            return '4';
        }
        if ((c >= 'j' && c <= 'l') || (c >= 'J' && c <= 'L')){
            return '5';
        }
        if ((c >= 'm' && c <= 'o') || (c >= 'M' && c <= 'O')){
            return '6';
        }
        if ((c >= 'p' && c <= 's') || (c >= 'P' && c <= 'S')){
            return '7';
        }
        if ((c >= 't' && c <= 'v') || (c >= 'T' && c <= 'V')){
            return '8';
        }
        if ((c >= 'w' && c <= 'z') || (c >= 'W' && c <= 'Z')){
            return '9';
        }
        return ' ';
    }

    public static String reverse(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            ans = s.charAt(i) + ans;
        }
        return ans;
    }

    public static String convert(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++){
            if (conv(s.charAt(i)) != ' '){
                ans += conv(s.charAt(i));
            }
        }
        return ans;
    }

    public static void solve() {
        String s = convert(sc.nextLine());
        if (s.equals(reverse(s))) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}