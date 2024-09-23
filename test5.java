import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test5{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        int n = sc.nextInt();
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < n; i++){
            int k = sc.nextInt();
            if (freq.get(k) == null) freq.put(k, 1);
            else freq.put(k, freq.get(k) + 1);
        }
        List<Entry<Integer, Integer>> sortedMap = freq.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
        List<Integer> res = new ArrayList<>();
        for (Entry<Integer, Integer> entry: sortedMap){
            for (int i = 0; i < entry.getValue(); i++){
                res.add(entry.getKey());
            }
        } 
        for (int i: res){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}
