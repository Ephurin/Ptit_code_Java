import java.util.Scanner;
import java.util.TreeSet;
import java.io.File;
import java.io.IOException;

class IntSet{
    TreeSet<Integer> set;

    IntSet(int[] a){
        set = new TreeSet<>();
        for(int i : a) set.add(i);
    }

    public IntSet intersection(IntSet s){
        IntSet res = new IntSet(new int[0]);
        for(int i : set){
            if(s.set.contains(i)) res.set.add(i);
        }
        return res;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i : set) sb.append(i + " ");
        return sb.toString().trim();
    }

}

public class J07009 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
        sc.close();
    }
}
