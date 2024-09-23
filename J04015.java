import java.util.Scanner;

class Teacher{
    String type_ID, role, name;
    int basic_salary, salary_level, support;

    Teacher(String type_ID, String name, int basic_salary){
        this.type_ID = type_ID;
        this.role = type_ID.substring(0, 2);
        this.salary_level = (type_ID.charAt(2) - '0') * 10 + type_ID.charAt(3) - '0';
        this.name = name;
        this.basic_salary = basic_salary;
        if (this.role.equals("HT")){
            this.support = 2000000;
        }
        else if (this.role.equals("HP")){
            this.support = 900000;
        }
        else if (this.role.equals("GV")){
            this.support = 500000;
        }
    }

    public int salary(){
        return this.basic_salary * this.salary_level + this.support;
    }

    @Override
    public String toString(){
        return this.type_ID + " " + this.name + " " + this.salary_level + " " + this.support + " " + this.salary();
    }
}

public class J04015{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c =  sc.nextInt();

        Teacher t = new Teacher(a, b, c);
        System.out.print(t);
    }
}