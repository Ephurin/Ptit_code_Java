import java.util.Scanner;

class Fraction2{
    long nummerator, denominator;

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    Fraction2(long nummerator, long denominator){
        this.nummerator = nummerator;
        this.denominator = denominator;
    }

    public static Fraction2 add(Fraction2 a, Fraction2 b){
        long add_nummerator = a.nummerator * b.denominator + a.denominator * b.nummerator;
        long add_denominator = a.denominator * b.denominator;
        long k = gcd(add_nummerator, add_denominator);

        return new Fraction2((add_nummerator / k) * (add_nummerator / k), (add_denominator /k) * (add_denominator /k));
    }

    public static Fraction2 times(Fraction2 a, Fraction2 b, Fraction2 c){
        long add_nummerator = a.nummerator * b.nummerator * c.nummerator;
        long add_denominator = a.denominator * b.denominator * c.denominator;
        long k = gcd(add_nummerator, add_denominator);

        return new Fraction2(add_nummerator / k, add_denominator /k);
    }

    @Override
    public String toString(){
        return this.nummerator + "/" + this.denominator; 
    }
}

public class J04014{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        Fraction2 A = new Fraction2(sc.nextLong(), sc.nextLong());
        Fraction2 B = new Fraction2(sc.nextLong(), sc.nextLong());
        Fraction2 C = Fraction2.add(A, B);
        Fraction2 D = Fraction2.times(A, B, C);

        System.out.println(C + " " + D);
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}