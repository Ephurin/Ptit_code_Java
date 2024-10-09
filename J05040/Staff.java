package J05040;

public class Staff {
    String SID, name, position;
    int basic_salary, working_days, reward, support, total_salary;
    static int id = 1;

    Staff(String name, int basic_salary, int working_days, String position){
        this.SID = String.format("NV%02d", id++);
        this.name = name;
        this.basic_salary = basic_salary;
        this.working_days = working_days;
        this.position = position;
        this.support = this.sp();
        this.reward = this.rw();
        this.total_salary = this.basic_salary * this.working_days + this.support + this.reward;
    }

    public int sp() {
        if (this.position.equals("GD")) return 250000;
        else if (this.position.equals("PGD")) return 200000;
        else if (this.position.equals("TP")) return 180000;
        else return 150000;
    }

    public int rw(){
        if (this.working_days >= 25){
            return basic_salary * working_days / 5;
        }
        else if(this.working_days >= 22){
            return basic_salary * working_days / 10;
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.SID + " " + this.name + " " + this.basic_salary * this.working_days + " " + this.reward + " " + this.support + " " + this.total_salary;
    }
}
