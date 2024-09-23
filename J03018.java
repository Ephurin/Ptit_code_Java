import java.util.Scanner;

public class J03018{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            int k;
            if(s.length() >= 2) k = (s.charAt(s.length() - 2) - '0') * 10 + (s.charAt(s.length() - 1) - '0');
            else k = (s.charAt(s.length() - 1) - '0');
            if (k % 4 == 0) System.out.println(4);
            else System.out.println(0);
        }
    }
}