package J05025;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J05025 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            teachers.add(new Teacher(sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(teachers, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o1.getLastName().equals(o2.getLastName())) {
                    return o1.ID.compareTo(o2.ID);
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
