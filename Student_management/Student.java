package Student_management;

import java.util.Scanner;

public class Student {
    private String SID, name, class_, dob;
    private double GPA;

    public Student(){
        this.SID = "";
        this.name = "";
        this.class_ = "";
        this.dob = "";
        this.GPA = 0;
    }

    public Student(String name, String class_, String dob, double GPA){
        this.SID = "B20DCCN001";
        this.name = name;
        this.class_ = class_;
        this.dob = nomalization(dob);
        this.GPA = GPA;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        this.SID = "B20DCCN001";
        this.name = sc.nextLine();
        this.class_ = sc.nextLine();
        this.dob = nomalization(sc.nextLine());
        this.GPA = sc.nextDouble();
        sc.close();
    }

    public void output(){
        System.out.printf("%s %s %s %s %.2f", this.SID, this.name, this.class_, this.dob, this.GPA);
    }

    private String nomalization(String s){
        // 12/12/1212
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(2) != '/') sb.insert(0, '0');
        if (sb.charAt(5) != '/') sb.insert(3, '0');
        return sb.toString();
    }

}
