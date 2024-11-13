import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class J08024{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            q.add(9l);
            while(!q.isEmpty()){
                Long top = q.poll();
                if (top % n == 0){
                    System.out.println(top);
                    break;
                } else {
                    q.add(top * 10);
                    q.add(top * 10 + 9);
                }
            }
        }
    }
}