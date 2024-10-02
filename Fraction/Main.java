package Fraction;
import java.util.Scanner;;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        Fraction f = new Fraction(a, b);
        f.simplyfied();
    }
}

