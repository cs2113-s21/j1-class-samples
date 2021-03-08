

public class Triangle{
        //Heron's formula
        public static double area(Point p1, Point p2, Point p3){
            double semiperm = Triangle.perimeter(p1,p2,p3)/2;
            return Math.sqrt(semiperm * (semiperm - p1.dist(p2)) *
                                        (semiperm - p1.dist(p3)) *
                                        (semiperm - p2.dist(p3)));

        }
        public static double perimeter(Point p1, Point p2, Point p3){
            return p1.dist(p2) + p1.dist(p3) + p2.dist(p3);
        }

}

