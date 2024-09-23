import java.util.Scanner;

public class test3{

    public static Scanner sc = new Scanner(System.in);

	public static void solve() {
		String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) > '2' || s.charAt(i) < '0'){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
	}

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
		while(t-- > 0){
			solve();
		}
    }
}