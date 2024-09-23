import java.util.Scanner;

class Agent2{
    String AID, name, position;
    int basic_daily_salary, working_days, support, additional_rew, salary;
    Agent2(String name, int basic_daily_salary, int working_days, String position){
        this.AID = "NV01";
        this.name = name;
        this.basic_daily_salary = basic_daily_salary;
        this.working_days = working_days;
        this.position = position;
        this.salary = basic_daily_salary * working_days;
        if (this.position.charAt(0) == 'G'){
            this.support = 250000;
        }
        else if (this.position.charAt(0) == 'P'){
            this.support = 200000;
        }
        else if (this.position.charAt(0) == 'T'){
            this.support = 180000;
        }
        else if (this.position.charAt(0) == 'N'){
            this.support = 150000;
        }

        if (working_days >= 25){
            this.additional_rew = this.salary / 5;
        }
        else if (working_days >= 22 && working_days < 25){
            this.additional_rew = this.salary / 10;
        }
        else this.additional_rew = 0;
    }

    public int income() {
        return this.salary + this.additional_rew + this.support;
    }

    @Override
    public String toString(){
        return this.AID + " " + this.name + " " + this.salary + " " + this.additional_rew + " " + this.support + " " + this.income();
    }
}

public class J04012{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String name = sc.nextLine();
        int basic_daily_salary = sc.nextInt();
        int working_days = sc.nextInt();
        sc.nextLine();
        String position = sc.nextLine();

        Agent2 AA = new Agent2(name, basic_daily_salary, working_days, position);
        System.out.print(AA); 
    }
}