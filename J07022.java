import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J07022 {

    public static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim();
            String[] ss = s.split("\\s+");
            for(String st : ss){
                if(!isInteger(st)){
                    list.add(st);
                }
            }
        }
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String s : list){
            System.out.print(s + " ");
        }
        sc.close();
        
    }    
}
