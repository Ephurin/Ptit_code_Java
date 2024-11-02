import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        Scanner sc = new Scanner(f);
        while(true){
            String s = sc.nextLine().trim();
            if (s.equals("END")){
                break;
            }
            StringBuilder sb = new StringBuilder();
            String[] ss = s.split("\\s+");
            for (String st : ss){
                sb.append(Character.toUpperCase(st.charAt(0)));
                sb.append(st.substring(1).toLowerCase());
                sb.append(" ");
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
