import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Subject{
    String SID, name;
    int credit;

    Subject(String SID, String name, int credit){
        this.SID = SID;
        this.name = name;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return SID + " " + name + " " + credit;
    }
}

public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Subject[] subjects = new Subject[n];
        for (int i = 0; i < n; i++){
            String SID = sc.nextLine();
            String name = sc.nextLine();
            int credit = sc.nextInt();
            if (sc.hasNextLine()){
                sc.nextLine();
            }
            subjects[i] = new Subject(SID, name, credit);
        }
        Arrays.sort(subjects, new Comparator<Subject>(){
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        for (Subject s : subjects){
            System.out.println(s);
        }
        sc.close();
    }
}
