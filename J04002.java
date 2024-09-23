import java.util.Scanner;

class Rectange{
    private double length, width;
    String color;

    public Rectange(){
        this.length = 1;
        this.width = 1;
    }

    public Rectange(double length, double width, String color){
        this.length = length;
        this.width = width;
        this.color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColro(String color) {
        this.color = color;
    }

    public double findArea() {
        return (this.length + this.width) * 2;
    }

    public double findPerimeter() {
        return this.length * this.width;
    }
}

public class J04002{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String s = sc.nextLine().trim();

        if (a <= 0 || b <= 0){
            System.out.println("INVALID");
        }

        else{
            Rectange R = new Rectange(a, b, s);
            System.out.printf("%.0f %.0f %s", R.findArea(), R.findPerimeter(), R.getColor());
        }
        
    }
}