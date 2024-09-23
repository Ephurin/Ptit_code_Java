import java.util.Scanner;

public class J01016{

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String s = sc.nextLine();
        int count47 = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '4' || s.charAt(i) == '7'){
                count47++;
            }
        }
        if (count47 == 4 || count47 == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}