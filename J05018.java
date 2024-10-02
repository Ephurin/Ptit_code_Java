import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;

class Student_{
    String SID ,name, type;
    BigDecimal avg_point;
    int idd;
    static int id = 1;

    Student_(String name, BigDecimal[] point){
        this.idd = id;
        this.SID = "HS" + String.format("%02d", id++);
        this.name = name;
        this.avg_point = new BigDecimal(0);
        this.avg_point = this.avg_point.add(point[0]);
        this.avg_point = this.avg_point.add(point[1]);
        for (int i = 0; i < 10; i++){
            this.avg_point = this.avg_point.add(point[i]);
        }
        
        BigDecimal div = new BigDecimal("12");
        this.avg_point = this.avg_point.divide(div, 1, RoundingMode.HALF_UP);
        if (this.avg_point.compareTo(BigDecimal.valueOf(9)) >= 0) this.type = "XUAT SAC";
        else if (this.avg_point.compareTo(BigDecimal.valueOf(8)) >= 0) this.type = "GIOI";
        else if (this.avg_point.compareTo(BigDecimal.valueOf(7)) >= 0) this.type = "KHA";
        else if (this.avg_point.compareTo(BigDecimal.valueOf(5)) >= 0) this.type = "TB";
        else this.type = "YEU";
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.avg_point + " " + this.type;
    }
}

public class J05018{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        Student_[] S = new Student_[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            BigDecimal[] point = new BigDecimal[10];
            for (int j = 0; j < 10; j++){
                point[j] = sc.nextBigDecimal();
            }
            S[i] = new Student_(name, point);
        }
        Arrays.sort(S, new Comparator<Student_>(){
            @Override
            public int compare(Student_ a, Student_ b){
                if (a.avg_point.compareTo(b.avg_point) == 0){
                    if (a.idd > b.idd){
                        return 1;
                    }
                }
                else if (a.avg_point.compareTo(b.avg_point) < 0){
                    return 1;
                }
                return -1;
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}