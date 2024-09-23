import java.util.Scanner;

class Contestant{
    String SID, name, state, zone;
    double math_grade, physics_grade, chemistry_grade, priority_grade, sum_grade;

    Contestant(String SID, String name, double math_grade, double physics_grade, double chemistry_grade){
        this.SID = SID;
        this.name = name;
        this.math_grade = math_grade;
        this.physics_grade = physics_grade;
        this.chemistry_grade = chemistry_grade;
        this.zone = this.SID.substring(0, 3);

        if (this.zone.charAt(2) == '1'){
            priority_grade = 0.5;
        }
        else if (this.zone.charAt(2) == '2'){
            priority_grade = 1;
        }
        else if (this.zone.charAt(2) == '3'){
            priority_grade = 2.5;
        }
        
        this.sum_grade = this.math_grade * 2 + this.physics_grade + this.chemistry_grade;

        if (this.sum_grade + this.priority_grade >= 24.0){
            this.state = "TRUNG TUYEN";
        }
        else this.state = "TRUOT";
    }

    @Override
    public String toString(){
        String priority_Grade;
        String sum_Grade;

        if (this.priority_grade == (int)this.priority_grade){
            priority_Grade = String.format("%.0f", this.priority_grade);
        }
        else {
            priority_Grade = String.format("%.1f", this.priority_grade);
        }

        if (this.sum_grade == (int)this.sum_grade){
            sum_Grade = String.format("%.0f", this.sum_grade);
        }
        else {
            sum_Grade = String.format("%.1f", this.sum_grade);
        }
        return this.SID + " " + this.name + " " + priority_Grade + " " + sum_Grade + " " + this.state;
    }
}

public class J04013{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String SID = sc.nextLine();
        String name = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Contestant cs = new Contestant(SID, name, a, b, c);

        System.out.println(cs);
    }
}