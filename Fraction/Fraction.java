package Fraction;

public class Fraction {
    private long nummerator, denominator;

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

