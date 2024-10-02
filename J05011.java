import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Client_{
    String CID, name, in_time, out_time;
    int hour, minute;

    Client_(String CID, String name, String in_time, String out_time){
        this.CID = CID;
        this.name = name;
        this.in_time = in_time;
        this.out_time = out_time;
        this.hour = (out_time.charAt(0) - in_time.charAt(0)) * 10 + out_time.charAt(1) - in_time.charAt(1);
        this.minute = (out_time.charAt(3) - in_time.charAt(3)) * 10 + out_time.charAt(4) - in_time.charAt(4);
        while(this.minute < 0){
            this.minute += 60;
            this.hour -= 1;
        }
    }

    @Override
    public String toString(){
        return this.CID + "  " + this.name + " " + this.hour + " gio " + this.minute + " phut";
    }
}

public class J05011{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int n = sc.nextInt();
        sc.nextLine();
        Client_[] C = new Client_[n];
        for (int i = 0; i < n; i++){
            C[i] = new Client_(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(C, new Comparator<Client_>(){
            @Override
            public int compare(Client_ a, Client_ b){
                if (a.hour < b.hour || (a.hour == b.hour && a.minute < b.minute)){
                    return 1;
                }
                return -1;
            }
        });
        for (int i = 0; i < n; i++){
            System.out.println(C[i]);
        }
    }
}