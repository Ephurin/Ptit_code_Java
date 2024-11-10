import java.util.Scanner;
import java.util.TreeSet;

class WordSet{
    TreeSet<String> set;

    public WordSet(String s){
        set = new TreeSet<>();
        String[] a = s.trim().toLowerCase().split("\\s+");
        for(String i : a) set.add(i);
    }

    public WordSet union (WordSet s){
        WordSet res = new WordSet("");
        for(String i : set) res.set.add(i);
        for(String i : s.set) res.set.add(i);
        return res;
    }

    public WordSet intersection (WordSet s){
        WordSet res = new WordSet("");
        for(String i : set){
            if(s.set.contains(i)) res.set.add(i);
        }
        return res;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String i : set) sb.append(i + " ");
        return sb.toString().trim();
    }
}

public class J04022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
        in.close();
    }
}
