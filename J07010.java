import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Student1{
    String SID, name, class_, dob;
    double GPA;
    static int count = 0;

    Student1(String name, String class_, String dob, double GPA){
        this.SID = "B20DCCN" + String.format("%03d", ++count);
        this.name = name;
        this.class_ = class_;
        this.dob = fixdob(dob);
        this.GPA = GPA;
    }

    public String fixdob(String s){
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(2) != '/') sb.insert(0, '0');
        if (sb.charAt(5) != '/') sb.insert(3, '0');
        return sb.toString();
    }

    @Override
    public String toString(){
        return SID + " " + name + " " + class_ + " " + dob + " " + String.format("%.2f", GPA);
    }
}


public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("SV.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        sc.nextLine();
        Student1[] students = new Student1[n];
        for (int i = 0; i < n; ++i){
            String name = sc.nextLine();
            String class_ = sc.nextLine();
            String dob = sc.nextLine();
            double GPA = sc.nextDouble();
            if (sc.hasNext()) sc.nextLine();
            students[i] = new Student1(name, class_, dob, GPA);
        }
        for (Student1 student : students){
            System.out.println(student);
        }
        sc.close();
    }
}
