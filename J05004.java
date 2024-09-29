import java.util.Scanner;
import java.lang.StringBuilder;

class Uni_Student1{
    String SID, name, class_, dob;
    double GPA;
    private static int id = 1;

    Uni_Student1(String name, String class_, String dob, double GPA){
        this.SID = "B20DCCN" + String.format("%03d", id++);
        this.name = nomalization(name);
        this.class_ = class_;
        this.GPA = GPA;
        StringBuilder sb = new StringBuilder(dob);
        if (sb.charAt(2) != '/') sb.insert(0, '0');
        if (sb.charAt(5) != '/') sb.insert(3, '0');
        this.dob = sb.toString();
    }

    private String nomalization(String s){
        String[] ss = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String i : ss){
            sb.append(i.substring(0, 1).toUpperCase());
            sb.append(i.substring(1).toLowerCase());
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.class_ + " " + this.dob + " " + String.format("%.2f", this.GPA);
    }
}

public class J05004{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Uni_Student1[] S = new Uni_Student1[n];
        for (int i = 0; i < n; i++){
            S[i] = new Uni_Student1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sc.nextLine();
        }
        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}