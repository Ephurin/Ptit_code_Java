package J05029;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class J05029 {
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

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for (Company company : companies) {
                if (company.interm_number >= a && company.interm_number <= b) {
                    System.out.println(company);
                }
            }
        }
    }
}
