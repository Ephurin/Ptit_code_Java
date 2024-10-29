import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002{

    public static boolean check(String s){
        if (s.length() > 10) return false;
        long n = 0;
        for(int i = 0; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))) return false;
            else{
                n = n * 10 + s.charAt(i) - '0';
            }
        }
        if (n > Integer.MAX_VALUE) return false;
        return true;
    }

    public static void main(String[]args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        long ans = 0;
        while(sc.hasNext()){
            String s = sc.next();
            if (check(s)) ans += Long.parseLong(s);
        }
        System.out.println(ans);
        sc.close();
    }
}