import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        int[] a = new int[1005];
        while(sc.hasNext()){
            a[sc.nextInt()]++;
        }
        for (int i = 0; i < 1000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        sc.close();
    }
}
