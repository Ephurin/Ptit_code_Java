import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Staffs1{
    String SID, name, gender, dob, adress, tax_num, contract_signing_date;
    private static int id = 1;

    Staffs1(String name, String gender, String dob, String adress, String tax_num, String contract_signing_date){
        this.SID = String.format("%05d", id++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.adress = adress;
        this.tax_num = tax_num;
        this.contract_signing_date = contract_signing_date;
    }

    int time_to_num(){
        int res = 0;
        for (int i = 6; i <= 9; i++){
            res = res * 10 + this.dob.charAt(i) - '0';
        }
        res = res * 10 + this.dob.charAt(3) - '0';
        res = res * 10 + this.dob.charAt(4) - '0';
        res = res * 10 + this.dob.charAt(0) - '0';
        res = res * 10 + this.dob.charAt(1) - '0';
        return res;
    }

    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", this.SID, this.name, this.gender, this.dob, this.adress, this.tax_num, this.contract_signing_date);
    }
}

public class J05007{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Staffs1[] S = new Staffs1[n];
        for (int i = 0; i < n; i++){
            S[i] = new Staffs1(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }

        Arrays.sort(S, new Comparator<Staffs1>(){
            @Override
            public int compare(Staffs1 a, Staffs1 b){
                return a.time_to_num() - b.time_to_num(); 
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}