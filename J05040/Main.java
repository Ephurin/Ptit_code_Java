package J05040;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        Staff[] S = new Staff[n];
        for (int i = 0; i < n; i++){
            String name = sc.nextLine();
            int basic_salary = sc.nextInt();
            int working_days = sc.nextInt();
            sc.nextLine();
            String position = sc.nextLine();
            S[i] = new Staff(name, basic_salary, working_days, position);
        }
        for (int i = 0; i < n; i++){
            System.out.println(S[i]);
        }
    }
}
