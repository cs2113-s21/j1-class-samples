

//Point.java
import java.util.Scanner;

public class Point{

    private double x,y;

    public Point(double X, double Y){
        this.x = X;
        this.y = Y;
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
    }
    
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double dist(Point other){
        return Math.sqrt(Math.pow(this.x-other.getX(),2) +
                         Math.pow(this.y-other.getY(),2));
    }

    public static Point nextPoint(Scanner sc){
        if(!sc.hasNextDouble()){ return null;}
        double x = sc.nextDouble();
        if(!sc.hasNextDouble()){ return null;}
        double y = sc.nextDouble();
        return new Point(x,y);
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}

