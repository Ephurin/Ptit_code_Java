import java.util.Scanner;

class ComplexNum{
    int a, b;

    ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static ComplexNum add(ComplexNum x, ComplexNum y){
        ComplexNum ans = new ComplexNum(x.a + y.a, x.b + y.b);
        return ans;
    }

    public static ComplexNum times(ComplexNum x, ComplexNum y){
        ComplexNum ans = new ComplexNum(x.a * y.a - x.b * y.b, x.a * y.b + x.b * y.a);
        return ans;
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }
}

public class J04018{
    public static Scanner sc = new Scanner(System.in);

    public static void solve(){
        ComplexNum A = new ComplexNum(sc.nextInt(), sc.nextInt());
        ComplexNum B = new ComplexNum(sc.nextInt(), sc.nextInt());
        ComplexNum C = ComplexNum.add(A, B);
        ComplexNum D = ComplexNum.times(C, A);
        ComplexNum E = ComplexNum.times(C, C);
        System.out.println(D + ", " + E);
    }

    public static void main(String[]args){
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}