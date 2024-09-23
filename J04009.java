import java.util.Scanner;

class Point2{
    double x, y;

    public Point2(){

    }

    public Point2(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point2(Point2 p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(Point2 p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
    }

    public static double distance(Point2 p1, Point2 p2){
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    @Override
    public String toString(){
        return x + " " + y;
    }
}

public class J04009{
    public static Scanner sc = new Scanner(System.in);

    public static void solve() {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        Point2 A = new Point2(a, b);
        Point2 B = new Point2(c, d);
        Point2 C = new Point2(e, f);

        double AB = Point2.distance(A, B);
        double AC = Point2.distance(A, C);
        double BC = Point2.distance(C, B);

        if (AB >= AC + BC || AC >= AB + BC || BC >= AB + AC){
            System.out.println("INVALID");
        }
        else System.out.printf("%.2f\n", 0.25 * Math.sqrt((AB + AC + BC) * (AC - AB + BC) * (AB - AC + BC) * (AB + AC - BC) ));
    }

    public static void main(String[]args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}