package J05024;

import java.util.Scanner;
import java.util.ArrayList;

public class J05024 {
    public static Scanner sc = new Scanner(System.in);

    public static String deparment_aka(Student S){
        String tmp = S.SID.substring(5, 7);
        if(S.class_.charAt(0) != 'E' && tmp.equals("CN"))
            return "CONG NGHE THONG TIN";
        if(tmp.equals("KT"))
            return "KE TOAN";
        if(S.class_.charAt(0) != 'E' && tmp.equals("AT"))
            return "AN TOAN THONG TIN";
        if(tmp.equals("VT"))
            return "VIEN THONG";
        if(tmp.equals("DT"))
            return "DIEN TU";
        return "";
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            students.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        sc.nextLine();
        while(q-- > 0){
            String deparment = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + deparment + ":");
            for (Student i : students){
                if (deparment_aka(i).equals(deparment)){
                    System.out.println(i);
                }
            }
        }
    }
}
