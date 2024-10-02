import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Coleage_Student{
    String SID, name, class_, email;

    Coleage_Student(String SID, String name, String class_, String email){
        this.SID = SID;
        this.name = name;
        this.class_ = class_;
        this.email = email;
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.class_ + " " + this.email;
    }
}

public class J05020{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Coleage_Student[] C = new Coleage_Student[n];
        for (int i = 0; i < n; i++){
            C[i] = new Coleage_Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(C, new Comparator<Coleage_Student>(){
            @Override
            public int compare(Coleage_Student a, Coleage_Student b){
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
            System.out.println(C[i]);
        }
    }
}