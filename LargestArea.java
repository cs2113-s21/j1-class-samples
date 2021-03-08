import java.util.Scanner;

public class LargestArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four points with label:");
        //declare four points in an array
        
        LabPoint points[] = new LabPoint[4];        
        for(int i=0;i<points.length;i++){
            points[i] = LabPoint.nextPoint(sc);
        }

        //create all four possible triangles by group three points together
        LabPoint triangles[][] = { {points[0],points[1],points[2]},
                                {points[0],points[1],points[3]},
                                {points[0],points[2],points[3]},
                                {points[1],points[2],points[3]}};

        //find the triangle with largest area!
        int maxI=0;//assume it's the first, first
        double maxArea = Triangle.area(triangles[maxI][0],
                                       triangles[maxI][1],
                                       triangles[maxI][2]);

        for(int i=1;i<triangles.length;i++){
            double curArea = Triangle.area(triangles[i][0],
                                           triangles[i][1],
                                           triangles[i][2]);
            if( curArea > maxArea){
                maxI = i;
                maxArea = curArea;
            }
        }

        //print out the max triangle
        System.out.println("The largest triangle is:");
        System.out.printf("%s %s %s\n",triangles[maxI][0], //toString method of Point
                                       triangles[maxI][1],
                                       triangles[maxI][2]);
        System.out.printf("With area %.2f\n",maxArea);

    }
}
