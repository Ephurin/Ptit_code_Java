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

public class J04004{
    public static Scanner sc = new Scanner(System.in);

    public static void add_(Fraction f, Fraction fs) {
        long h = f.nummerator * fs.denominator + f.denominator * fs.nummerator;
        long k = f.denominator * fs.denominator;
        Fraction j = new Fraction(h, k);
        j.simplyfied();
    }
    public static void main(String[]args) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        Fraction f = new Fraction(a, b);
        Fraction fs = new Fraction(c, d);
        add_(f, fs);
    }
}