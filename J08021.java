import java.util.Scanner;
import java.util.Stack;

public class J08021 {
    public static Scanner sc = new Scanner(System.in);

    public static int solve(String s){
        Stack<Integer> st = new Stack<>();
        int MaxLen = 0;
        st.push(-1);
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(') st.push(i);

            else{
                st.pop();
                if (!st.isEmpty()){
                    MaxLen = Math.max(MaxLen, i - st.peek());
                }
                else{
                    st.add(i);
                }
            }
        }

        return MaxLen;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }
}
