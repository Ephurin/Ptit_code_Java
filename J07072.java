import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class Name implements Comparable<Name>{
    String name, last_name;

    public static String nomalize(String s){
        s = s.trim().toLowerCase();
        String[] ss = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(String x : ss){
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }

    Name(String name){
        this.name = nomalize(name);
        String[] ss = this.name.split("\\s+");
        this.last_name = ss[ss.length - 1];
    }

    @Override
    public int compareTo(Name x){
        if (this.last_name.compareTo(x.last_name) > 0) return 1;
        else if (this.last_name.compareTo(x.last_name) < 0) return -1;
        else return this.name.compareTo(x.name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class J07072 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(new Name(sc.nextLine()));
        }
        Collections.sort(list);
        for (Name x : list) {
            System.out.println(x);
        }
        sc.close();
    }
}
