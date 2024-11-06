import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class SinhVien_ implements Comparable<SinhVien_>{
    String SID, name;
    double score1, score2, score3, avg;
    int rank;
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

    SinhVien_(String name, double score1, double score2, double score3){
        this.SID = String.format("SV%02d", id++);
        this.name = nomalize(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.avg = (score1 * 3 + score2 * 3 + score3 * 2) / 8;
    }

    public void setRank(int n){
        this.rank = n;
    }

    @Override
    public int compareTo(SinhVien_ x){
        if (this.avg < x.avg) return 1;
        else if (this.avg > x.avg) return -1;
        else return this.SID.compareTo(x.SID);
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + String.format("%.2f ", this.avg) + this.rank;
    }
}

public class J07054 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien_> SV = new ArrayList<>();
        for (int i = 0; i < n; i++){
            SV.add(new SinhVien_(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            if(sc.hasNextLine()) sc.nextLine();
        }
        Collections.sort(SV);
        int cnt = 0, prev_rank = 1;
        double prev_avg = -1;
        for (SinhVien_ i : SV){
            ++cnt;
            if (prev_avg == -1){
                i.setRank(cnt);
                prev_avg = i.avg;
                prev_rank = i.rank;
            }
            else if (prev_avg == i.avg){
                i.setRank(prev_rank);
                prev_avg = i.avg;
                prev_rank = i.rank;
            }
            else if (i.avg < prev_avg){
                i.setRank(cnt);
                prev_avg = i.avg;
                prev_rank = cnt;
            }
        }
        for(SinhVien_ i: SV){
            System.out.println(i);
        }
        sc.close();
    }
}
