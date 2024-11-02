import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Company_{
    String CID, name;
    int staff_hiring;

    Company_(String CID, String name, int staff_hiring){
        this.CID = CID;
        this.name = name;
        this.staff_hiring = staff_hiring;
    }

    @Override
    public String toString() {
        return CID + " " + name + " " + staff_hiring;
    }
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Company_[] companies = new Company_[n];
        for (int i = 0; i < n; i++){
            String CID = sc.nextLine();
            String name = sc.nextLine();
            int staff_hiring = sc.nextInt();
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            companies[i] = new Company_(CID, name, staff_hiring);
        }

        Arrays.sort(companies, new Comparator<Company_>(){
            @Override
            public int compare(Company_ o1, Company_ o2) {
                return o1.CID.compareTo(o2.CID);
            }
        });

        for (Company_ c : companies){
            System.out.println(c);
        }

        sc.close();
    }
}
