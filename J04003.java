import java.util.Scanner;

class Fraction{
    long nummerator, denominator;

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    Fraction(long nummerator, long denominator){
        this.nummerator = nummerator;
        this.denominator = denominator;
    }

    public void simplyfied(){
        long k = gcd(this.nummerator, this.denominator);
        System.out.printf("%d/%d", this.nummerator/k, this.denominator/k);
    }
}

public class J04003{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        Fraction f = new Fraction(a, b);
        f.simplyfied();
    }
}