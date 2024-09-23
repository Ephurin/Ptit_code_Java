import java.util.Scanner;

class Agent{
    String name, gender, dob, adress, FID, contract_sighing_date;
    String ID = "00001";

    Agent(String name, String gender, String dob, String adress, String FID, String contract_sighing_date){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.adress = adress;
        this.FID = FID;
        this.contract_sighing_date = contract_sighing_date;
    }

    @Override
    public String toString(){
        return "00001 " + this.name + " " + this.gender + " " + this.dob + " " + this.adress + " " + this.FID + " " + this.contract_sighing_date;
    }
}

public class J04007{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        String e = sc.nextLine();
        String f = sc.nextLine();
        
        Agent k = new Agent(a, b, c, d, e, f);
        System.out.print(k);
    }
}