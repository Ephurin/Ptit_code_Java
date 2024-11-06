import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class SinhVien__ implements Comparable<SinhVien__>{
    String SID, name, rank;
    double score1, score2, score3, avg;
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

    SinhVien__(String name, double score1, double score2, double score3){
        this.SID = String.format("SV%02d", id++);
        this.name = nomalize(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.avg = (score1 * 25 + score2 * 35 + score3 * 40) / 100;
        if (this.avg >= 8){
            this.rank = "GIOI";
        }
        else if (this.avg >= 6.5){
            this.rank = "KHA";
        }
        else if (this.avg >= 5){
            this.rank = "TRUNG BINH";
        }
        else this.rank = "KEM";
    }

    @Override
    public int compareTo(SinhVien__ x){
        if (this.avg < x.avg) return 1;
        else if (this.avg > x.avg) return -1;
        else return this.SID.compareTo(x.SID);
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + String.format("%.2f ", this.avg) + this.rank;
    }
}

public class J07055 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien__> SV = new ArrayList<>();
        for (int i = 0; i < n; i++){
            SV.add(new SinhVien__(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(sc.hasNextLine()) sc.nextLine();
        }
        Collections.sort(SV);
        for(SinhVien__ i: SV){
            System.out.println(i);
        }
        sc.close();
    }
}
