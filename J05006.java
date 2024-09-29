import java.util.Scanner;

class Staffs{
    String SID, name, gender, dob, adress, tax_num, contract_signing_date;
    private static int id = 1;

    Staffs(String name, String gender, String dob, String adress, String tax_num, String contract_signing_date){
        this.SID = String.format("%05d", id++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.adress = adress;
        this.tax_num = tax_num;
        this.contract_signing_date = contract_signing_date;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", this.SID, this.name, this.gender, this.dob, this.adress, this.tax_num, this.contract_signing_date);
    }
}

public class J05006{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Staffs[] S = new Staffs[n];
        for (int i = 0; i < n; i++){
            S[i] = new Staffs(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}