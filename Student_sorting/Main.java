package Student_sorting;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Student[] S = new Student[n];
        for (int i = 0; i < n ; i++){
            S[i] = new Student(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(S, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b){
                if (a.class_.compareTo(b.class_) > 0){
                    return 1;
                }
                else if (a.class_.compareTo(b.class_) == 0){
                    if (a.SID.compareTo(b.SID) > 0){
                        return 1;
                    }
                }
                return -1;
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}
