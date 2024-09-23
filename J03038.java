import java.util.Scanner;

public class J03038{
    public static Scanner sc = new Scanner(System.in);
    public static int[] cnt = new int[260]; 
    public static void main(String[]args) {
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            cnt[s.charAt(i)] = 1;
        }
        int ans = 0;
        for (int i = 'a'; i <= 'z'; i++){
            if (cnt[i] == 1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}