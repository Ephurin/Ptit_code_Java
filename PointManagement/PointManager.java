package PointManagement;
import java.util.Scanner;

public class PointManager {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-- > 0){
            Point P1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point P2 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.printf("%.4f", P1.distance(P2));
            System.out.println();
        }
    }
}
