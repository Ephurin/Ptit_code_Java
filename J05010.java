import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Goods{
    String name, good_type;
    int ID;
    double buying_price, selling_price, profit;
    private static int id = 1;

    Goods(String name, String good_type, double buying_price, double selling_price){
        this.ID = id++;
        this.name = name;
        this.good_type = good_type;
        this.buying_price = buying_price;
        this.selling_price = selling_price;
        this.profit = selling_price - buying_price;
    }

    @Override
    public String toString(){
        return this.ID + " " + this.name + " " + this.good_type + " " + String.format("%.2f", this.profit);
    }
}

public class J05010{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Goods[] G = new Goods[n];
        for (int i = 0; i < n; i++){
            G[i] = new Goods(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        Arrays.sort(G, new Comparator<Goods>(){
            @Override
            public int compare(Goods a, Goods b){
                if (a.profit < b.profit){
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < n; i++){
            System.out.println(G[i]);
        }
    }
}