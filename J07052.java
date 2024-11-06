import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class Contestant_ implements Comparable<Contestant_>{
    String CID, name, state;
    double score1, score2, score3, priority, sum;

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

    Contestant_(String CID, String name, double score1, double score2, double score3){
        this.CID = CID;
        this.name = nomalize(name);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        if (CID.substring(0, 3).equals("KV1")){
            this.priority = 0.5;
        }
        else if (CID.substring(0, 3).equals("KV2")){
            this.priority = 1;
        }
        else if (CID.substring(0, 3).equals("KV3")){
            this.priority = 2.5;
        }
        else this.priority = 0;

        this.sum = 2 * score1 + score2 + score3 + priority;
    }

    @Override
    public int compareTo(Contestant_ x){
        if (this.sum < x.sum) return 1;
        else if (this.sum > x.sum) return -1;
        else return this.CID.compareTo(x.CID);
    }

    public String Number_nomalization (double x){
        if ((int)(x * 10) % 10 == 0) return String.format("%.0f", x);
        return String.format("%.1f", x);
    }

    @Override
    public String toString(){
        return this.CID + " " + this.name + " " + Number_nomalization(priority) + " " + Number_nomalization(this.sum) + " " + this.state;
    }

    public void setState(String state){
        this.state = state;
    }

}

public class J07052 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Contestant_> arr = new ArrayList<>();
        while(n-- > 0){
            String CID = sc.nextLine();
            String name = sc.nextLine();
            double score1 = sc.nextDouble();
            double score2 = sc.nextDouble();
            double score3 = sc.nextDouble();
            if(!sc.hasNextInt() && sc.hasNextLine()) sc.nextLine();
            arr.add(new Contestant_(CID, name, score1, score2, score3));
        }

        Collections.sort(arr);
        int k = sc.nextInt(), cnt = 0;
        double DIEM_CHUAN = 0;
        for(Contestant_ x : arr){
            cnt++;
            if (cnt == k) DIEM_CHUAN = x.sum;
            if (x.sum < DIEM_CHUAN) x.setState("TRUOT");
            else x.setState("TRUNG TUYEN");
        }
        System.out.printf("%.1f\n",DIEM_CHUAN);
        for(Contestant_ x : arr){
            System.out.println(x);
        }
        sc.close();
    }
}
