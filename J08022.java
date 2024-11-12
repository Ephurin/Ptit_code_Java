import java.util.Scanner;
import java.util.Stack;

public class J08022 {
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        int[] a = new int[n];
        int[] R = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for (int i = n - 1; i >=0; i--){
            while(!st.empty() && a[i] >= a[st.peek()]){
                st.pop();
            }
            if (st.empty()){
                R[i] = -1;
            }
            else{
                R[i] = a[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++){
            System.out.print(R[i] + " ");
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
            System.out.println();
        }
    }
}