import java.util.Scanner;

public class J03024{

    public static Scanner sc = new Scanner(System.in);

    public static String check(String s) {
        int count_even = 0;
        int count_odd = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return "INVALID";
            else if (s.charAt(i) % 2 == 0) count_even ++;
            else count_odd++;
        }
        if (s.length() % 2 == 0 && count_even > count_odd) return "YES";
        return "NO";
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}