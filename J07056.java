import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class KhachHang implements Comparable<KhachHang> {
    String Client_ID, name, type;
    int pre, after, used, limit, in_limit_fee, out_limit_fee, fine, total_fee;
    static int id = 1;

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

    KhachHang(String name, String type, int pre, int after){
        this.Client_ID = "KH" + String.format("%02d", id++);
        this.name = nomalize(name);
        this.type = type;
        this.pre = pre;
        this.after = after;
        this.used = this.after - this.pre;

        if (this.type.equals("A")) this.limit = 100;
        else if (this.type.equals("B")) this.limit = 500;
        else this.limit = 200;

        if (this.used <= this.limit){
            this.in_limit_fee = this.used * 450;
            this.out_limit_fee = 0;
            this.fine = 0;
        }
        else {
            this.in_limit_fee = this.limit * 450;
            this.out_limit_fee = (this.used - this.limit) * 1000;
            this.fine = (this.used - this.limit) * 50;
        }

        this.total_fee = this.in_limit_fee + this.out_limit_fee + this.fine;

        
    }

    @Override
    public int compareTo(KhachHang o) {
        if (this.total_fee < o.total_fee) return 1;
        else if (this.total_fee == o.total_fee) {
            if (this.Client_ID.compareTo(o.Client_ID) > 0) return 1;
            else return -1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return this.Client_ID + " " + this.name + " " + this.in_limit_fee + " " + this.out_limit_fee + " " + this.fine + " " + this.total_fee;
    }
}

public class J07056 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<KhachHang> list = new ArrayList<>();
        while (t-- > 0) {
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.next();
            int pre = sc.nextInt();
            int after = sc.nextInt();
            list.add(new KhachHang(name, type, pre, after));
        }

        Collections.sort(list);

        for (KhachHang kh : list) System.out.println(kh);

        sc.close();
    }
}
