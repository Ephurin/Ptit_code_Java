import java.util.Scanner;
import java.util.Stack;

public class J08020 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if (st.isEmpty()) return false;
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            if (isValid(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
