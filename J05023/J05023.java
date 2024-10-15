package J05023;

import java.util.Scanner;
import java.util.ArrayList;

public class J05023 {
    public static Scanner sc = new Scanner(System.in);

    public static String deparment_aka(String s){
        if (s.equals("Ke Toan")) return "KT";
        else if (s.equals("Cong Nghe Thong Tin")) return "CN";
        else if (s.equals("An Toan Thong Tin")) return "AT";
        else if (s.equals("Vien Thong")) return "VT";
        else return "DT";
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
            String deparment = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + deparment + ":");
            for (Student i : students){
                if (deparment_aka(deparment).charAt(0) == i.class_.charAt(5) && deparment_aka(deparment).charAt(1) == i.class_.charAt(6)){
                    System.out.println(i);
                }
            }
        }
    }
}
