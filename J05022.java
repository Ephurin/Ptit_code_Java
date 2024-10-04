import java.util.Scanner;
import java.util.Arrays;

class Coleage_Student__{
    String SID, name, class_, email;

    Coleage_Student__(String SID, String name, String class_, String email){
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

public class J05022{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Coleage_Student__[] C = new Coleage_Student__[n];
        for (int i = 0; i < n; i++){
            C[i] = new Coleage_Student__(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String class_ = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + class_ + ":");
            for (int i = 0; i < n; i++){
                if (C[i].class_.equals(class_)){
                    System.out.println(C[i]);
                }
            }
        }
    }
}