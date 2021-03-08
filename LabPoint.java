import java.util.Scanner;

//LabPoint IS-A extenstion of Point
// has all the functionality of Point, via extends

public class LabPoint extends Point{

    //private Point p; //<this would be Has-A
    private String label;

    //no this.x here!
    //moreover x and y are private!
    
    public LabPoint(double x, double y, String lab){
        //constructing a Point and all its functionality and members
        super(x,y); //super referes to the super-type intance

        //once complete, I'm adding in the new functionality
        this.label = lab; //this referes to the current instance type
    }


    public String toString(){
        //I cannot use this.x and this.y becaue they are private members of Point
        // but I can use the getter/setters
        
        //return label+":("+this.getX()+","+this.getY()+")";

        //leveraging inheritance by access super's toString method
        return label+":"+super.toString();
    }

    public static LabPoint nextPoint(Scanner sc){
        if(! sc.hasNext()) return null; //quick error check!

        String lab = sc.next(); //read in our label
        Point p = Point.nextPoint(sc); //read a point
        
        if(p == null) return null; //quick error check
        
        return new LabPoint(p.getX(),p.getY(),lab);
        
    }
}
