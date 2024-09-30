import java.util.Scanner;

class Contestant1{
    String name, dob;
    double subj1, subj2, subj3;
    int SID;

    private static int id = 1;
    static double maxx = 0;

    Contestant1(String name, String dob, double subj1, double subj2, double subj3){
        this.SID = id++;
        this.name = name;
        this.dob = dob;
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;

        if (this.grade_sum() > Contestant1.maxx){
            Contestant1.maxx = this.grade_sum();
        }
    }

    double grade_sum() {
        return this.subj1 + this.subj2 +this.subj3;
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.dob + " " + this.grade_sum();
    }
}

public class J05009{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Contestant1[] C = new Contestant1[n];
        for (int i = 0; i < n; i++){
            C[i] = new Contestant1(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            sc.nextLine();
        }
        for (int i = 0; i < n; i++){
            if (C[i].grade_sum() == Contestant1.maxx){
                System.out.println(C[i]);
            }
        }
    }
}