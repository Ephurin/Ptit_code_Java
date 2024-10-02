import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Student_{
    String SID ,name, type;
    double avg_point;
    static int id = 1;

    Student_(String name, double[] point){
        this.SID = "HS" + String.format("%02d", id++);
        this.name = name;
        this.avg_point = point[0] + point[1];
        for (int i = 0; i < 10; i++){
            this.avg_point += point[i] + 0.01;
        }
        
        this.avg_point /= 12;
        if (this.avg_point >= 9) this.type = "XUAT SAC";
        else if (this.avg_point >= 8) this.type = "GIOI";
        else if (this.avg_point >= 7) this.type = "KHA";
        else if (this.avg_point >= 5) this.type = "TB";
        else this.type = "YEU";
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + String.format("%.1f", this.avg_point) + " " + this.type;
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
            double[] point = new double[10];
            for (int j = 0; j < 10; j++){
                point[j] = sc.nextDouble();
            }
            S[i] = new Student_(name, point);
        }
        Arrays.sort(S, new Comparator<Student_>(){
            @Override
            public int compare(Student_ a, Student_ b){
                if (a.avg_point < b.avg_point){
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