import java.util.Scanner;

public class J01010{

    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        String s = sc.nextLine();
        long ans = 0L;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                ans = ans * 10;
            }
            else if(s.charAt(i) == '1'){
                ans = ans * 10 + 1;
            }
            else{
                ans = 0;
                break;
            }
        }
        if (ans == 0){
            System.out.println("INVALID");
        }
        else{
            System.out.println(ans);
        }
    }

    public static void main(String[]args){
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            solve();
        }
    }
}