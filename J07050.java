import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class Product_ implements Comparable<Product_>{
    String Pid, name, type;
    double in_price, out_price, profit;
    public static int id = 1;

    Product_(String name, String type, double in_price, double out_price){
        this.Pid = "MH" + String.format("%02d", id++);
        this.name = name;
        this.type = type;
        this.in_price = in_price;
        this.out_price = out_price;
        this.profit = out_price - in_price;
    }

    @Override
    public int compareTo(Product_ o){
        if (this.profit == o.profit) return this.name.compareTo(o.name);
        return o.profit > this.profit ? 1 : -1;
    }

    @Override
    public String toString(){
        return Pid + " " + name + " " + type + " " + String.format("%.2f", profit);
    }

}

public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<Product_> ds = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String name = sc.nextLine();
            String type = sc.nextLine();
            double in_price = sc.nextDouble();
            double out_price = sc.nextDouble();
            if (sc.hasNextLine()) sc.nextLine();
            ds.add(new Product_(name, type, in_price, out_price));
        }
        Collections.sort(ds);
        for(Product_ tmp : ds){
            System.out.println(tmp);
        }
        sc.close();
    }
}
