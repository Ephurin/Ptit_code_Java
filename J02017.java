import java.util.Scanner;
import java.util.ArrayList;

public class J02017{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++){
            ar.add(sc.nextInt());
        }

        boolean isOK = true;
        while(isOK){
            isOK = false;
            for (int i = 1; i < ar.size(); i++){
                if ((ar.get(i) + ar.get(i - 1)) % 2 == 0){
                    ar.remove(i);
                    ar.remove(i - 1);
                    i--;
                    isOK = true;
                }
            }
        }

        System.out.println(ar.size());
    }
}