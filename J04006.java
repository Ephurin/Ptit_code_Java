import java.util.Scanner;

class SinhVien{
    String name, dob, classs;
    double point;

    SinhVien(String name, String classs, String dob, double point){
        this.name = name;
        this.classs = classs;
        this.dob = dob;
        this.point = point;
    }

    public void chuanHoa(){
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(2) != '/') sb.insert(0, '0');
        if(sb.charAt(5) != '/') sb.insert(3, '0');
        this.dob = sb.toString();
    }

    @Override
    public String toString(){
        return "B20DCCN001 " + this.name + " " + this.classs + " " + this.dob + " " + String.format("%.2f", this.point); 
    }
}

public class J04006{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String name = sc.nextLine();
        String classs = sc.nextLine();
        String dob = sc.nextLine();
        double point = sc.nextDouble();

        SinhVien sv = new SinhVien(name, classs, dob, point);
        sv.chuanHoa();
        System.out.print(sv.toString());
    }
}