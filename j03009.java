import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class j03009{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] w1 = s1.split("\\s+");
            String[] w2 = s2.split("\\s+");
            Set<String> set1 = new TreeSet<>(Arrays.asList(w1));
            Set<String> set2 = new TreeSet<>(Arrays.asList(w2));
            set1.removeAll(set2);
            for (String i : set1){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}