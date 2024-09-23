import java.util.Scanner;

public class J01001{
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 2 * (a + b);
        int d = a * b;
        if (a <= 0 || b <= 0 ){
            System.out.print("0");
        }
        else{
            System.out.print(c + " " + d);
        }
    }
}