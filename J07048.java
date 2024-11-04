import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class Product implements Comparable<Product>{
    String id, name;
    int price, limit;

    Product(String id, String name, int price, int limit){
        this.id = id;
        this.name = name;
        this.price = price;
        this.limit = limit;
    }

    @Override
    public int compareTo(Product o){
        if (this.price == o.price) return this.id.compareTo(o.id);
        return o.price - this.price;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.price + " " + this.limit;
    }
}

public class J07048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<Product> ds = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price = sc.nextInt();
            int limit = sc.nextInt();
            if (sc.hasNextLine()) sc.nextLine();
            ds.add(new Product(id, name, price, limit));
        }
        Collections.sort(ds);
        for(Product tmp : ds){
            System.out.println(tmp);
        }
        sc.close();
    }
}
