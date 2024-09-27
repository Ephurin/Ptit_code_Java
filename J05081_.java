import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Good1{
    String GID, name, unit;
    int in_price, out_price;
    private static int id = 1;

    Good1(String name, String unit, int in_price, int out_price){
        this.GID = "MH" + String.format("%03d", id++);
        this.name = name;
        this.unit = unit;
        this.in_price = in_price;
        this.out_price = out_price;
    }

    public int profit(){
        return this.out_price - this.in_price;
    }

    @Override
    public String toString(){
        return this.GID + " " + this.name + " " + this.unit + " " + this.in_price + " " + this.out_price + " " + this.profit();
    }
}

public class J05081_{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Good1[] G = new Good1[n];
        for (int i = 1; i <= n; i++){
            G[i - 1] = new Good1(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        Arrays.sort(G, new Comparator<Good1>(){
            @Override
            public int compare(Good1 a, Good1 b){
                return b.profit() - a.profit();
            }
        });
        for (int i = 0; i < n; i++){
            System.out.println(G[i]);
        }
    }
}