import java.util.Scanner;

class Good{
    String GID, name, unit;
    int in_price, out_price;
    private static int id = 1;

    Good(String name, String unit, int in_price, int out_price){
        this.GID = "MH" + String.format("%03d", id++);
        this.name = name;
        this.unit = unit;
        this.in_price = in_price;
        this.out_price = out_price;
    }

    public int profit(){
        return this.out_price - this.in_price;
    }

    @Override
    public String toString(){
        return this.GID + " " + this.name + " " + this.unit + " " + this.in_price + " " + this.out_price + " " + this.profit();
    }
}

public class J05081{
    public static Scanner sc = new Scanner(System.in);

    public static boolean greater(String a, String b){
        for (int i = 0; i < 5; i++){
            if (a.charAt(i) > b.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Good[] G = new Good[n];
        for (int i = 1; i <= n; i++){
            G[i - 1] = new Good(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            sc.nextLine();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i; j++){
                if (G[i].profit() > G[j].profit()){
                    Good tmp = G[i];
                    G[i] = G[j];
                    G[j] = tmp;
                }
                else if(G[i].profit() == G[j].profit()){
                    if (greater(G[j].GID, G[i].GID)){
                        Good tmp = G[i];
                        G[i] = G[j];
                        G[j] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.println(G[i]);
        }
    }
}