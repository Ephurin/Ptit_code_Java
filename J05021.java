import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Coleage_Student_{
    String SID, name, class_, email;

    Coleage_Student_(String SID, String name, String class_, String email){
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

public class J05021{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Coleage_Student_[] C = new Coleage_Student_[n];
        for (int i = 0; i < n; i++){
            C[i] = new Coleage_Student_(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(C, new Comparator<Coleage_Student_>(){
            @Override
            public int compare(Coleage_Student_ a, Coleage_Student_ b){
                return a.SID.compareTo(b.SID);
            }
        });
        for (int i = 0; i < n; i++){
            System.out.println(C[i]);
        }
    }
}