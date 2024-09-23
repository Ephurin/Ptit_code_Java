import java.util.Scanner;

class Student{
    String name, dob;
    double a, b, c;

    Student(String name, String dob, double a, double b, double c){
        this.name = name;
        this.dob = dob;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString(){
        return String.format("%s %s %.1f", this.name, this.dob, this.a + this.b + this.c);
    }
}

public class J04005{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String name = sc.nextLine();
        String dob = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Student s = new Student(name, dob, a, b, c);
        System.out.println(s.toString());
    }
}
