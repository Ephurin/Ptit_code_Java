import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;

class THISINH implements Comparable<THISINH> {
    String TID, name, religion, state;
    int zone;
    double point, priority, sum_point;
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

    THISINH(String name, String religion, int zone, double point){
        this.TID = "TS" + String.format("%02d", id++);
        this.name = nomalize(name);
        this.religion = religion;
        this.zone = zone;
        this.point = point;

        if (this.religion.toLowerCase().equals("kinh")) this.priority = 0;
        else this.priority = 1.5;

        if (this.zone == 1) this.priority += 1.5;
        else if (this.zone == 2) this.priority += 1;

        this.sum_point = this.point + this.priority;

        if (this.sum_point >= 20.5) this.state = "Do";
        else this.state = "Truot";
    }

    @Override
    public int compareTo(THISINH o) {
        if (this.sum_point < o.sum_point) return 1;
        else if (this.sum_point == o.sum_point) {
            if (this.TID.compareTo(o.TID) > 0) return 1;
            else return -1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return TID + " " + name + " " + sum_point + " " + state;
    }
}

public class J07057 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<THISINH> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            double point = sc.nextDouble();
            sc.nextLine();
            String religion = sc.nextLine();
            int zone = sc.nextInt();
            if(sc.hasNextLine()) sc.nextLine();
            list.add(new THISINH(name, religion, zone, point));
        }

        Collections.sort(list);

        for(THISINH x : list) System.out.println(x);

        sc.close();
    }

}
