package J05028;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J05028 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Company> companies = new ArrayList<>();
        for (int i = 0; i < n; i++){
            companies.add(new Company(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            sc.nextLine();
        }

        Collections.sort(companies, new Comparator<Company>() {
            @Override
            public int compare(Company a, Company b){
                if (a.interm_number == b.interm_number){
                    return a.CID.compareTo(b.CID);
                }
                return b.interm_number - a.interm_number;
            }
        });

        for (Company company : companies){
            System.out.println(company);
        }
    }
}
