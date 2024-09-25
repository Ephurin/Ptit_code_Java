import java.util.Scanner;

class Rec{
    double length, width;

    Rec(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.length + this.width) * 2;
    }
}

public class test{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        Rec c = new Rec(a, b);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
    }
}