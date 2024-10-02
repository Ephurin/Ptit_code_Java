package PointManagement;

public class Point {
    private double x;
    private double y;

    public Point(){
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double distance(Point secondPoint){
        return Math.sqrt((this.x - secondPoint.x) * (this.x - secondPoint.x) + (this.y - secondPoint.y) * (this.y - secondPoint.y));
    }

    public static double distance(Point P1, Point P2){
        return Math.sqrt((P1.x - P2.x) * (P1.x - P2.x) + (P1.y - P2.y) * (P1.x - P2.x));
    }

    @Override
    public String toString(){
        return x + " " + y;
    }
}
