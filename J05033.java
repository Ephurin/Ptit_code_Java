import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Time implements Comparable<Time>{
    int h, m, s;

    Time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString(){
        return this.h + " " + this.m + " " + this.s;
    }

    @Override
    public int compareTo(Time o){
        int s1 = this.h * 3600 + this.m * 60 + this.s;
        int s2 = o.h * 3600 + o.m * 60 + o.s;
        return s1 - s2;
    }
}

public class J05033{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        List<Time> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            a.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(a);
        for(Time i : a){
            System.out.println(i);
        }
    }
}