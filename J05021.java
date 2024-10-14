import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

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
        ArrayList<Coleage_Student_> C = new ArrayList<>();
        while(sc.hasNext()){
            C.add(new Coleage_Student_(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(C, new Comparator<Coleage_Student_>(){
            @Override
            public int compare(Coleage_Student_ a, Coleage_Student_ b){
                return a.SID.compareTo(b.SID);
            }
        });
        for (Coleage_Student_ i : C){
            System.out.println(i);
        }
    }
}