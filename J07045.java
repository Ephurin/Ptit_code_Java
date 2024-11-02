import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class LoaiPhong implements Comparable<LoaiPhong>{
    String type, name, price, service;

    LoaiPhong(String in){
        String[] s = in.split("\\s+");
        type = s[0];
        name = s[1];
        price = s[2];
        service = s[3];
    }

    @Override
    public int compareTo(LoaiPhong o){
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return type + " " + name + " " + price + " " + service;
    }
}

public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
        in.close();
    }
}
