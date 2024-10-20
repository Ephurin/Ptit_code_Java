package J05027;

import java.util.Scanner;
import java.util.ArrayList; 

public class J05027 {
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
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for (Teacher x : teachers){
                if (x.name.toLowerCase().contains(s.toLowerCase())){
                    System.out.println(x);
                }
            }
        }
    }
}