package J05026;

import java.util.Scanner;
import java.util.ArrayList; 
import java.util.Collections;

public class J05026 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < n; i++){
            teachers.add(new Teacher(sc.nextLine(), sc.nextLine()));
        }

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + Teacher.convert(s) + ":");
            for (Teacher x : teachers){
                if (Teacher.convert(x.subject).equals(Teacher.convert(s))){
                    System.out.println(x);
                }
            }
        }
    }
}