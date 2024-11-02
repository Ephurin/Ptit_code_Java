import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("VANBAN.in");
        Scanner sc = new Scanner(f);
        Set<String> S = new HashSet<>();
        while (sc.hasNext()){
            String s = sc.nextLine().toLowerCase();
            String[] ss = s.split("\\s+");
            for (String st : ss){
                S.add(st);
            }
        }
        ArrayList<String> ans = new ArrayList<>(S);
        Collections.sort(ans);
        for (String i : ans){
            System.out.println(i);
        }
        sc.close();
    }
}