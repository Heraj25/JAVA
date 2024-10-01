import java.util.*;
import java.math.*;

class Point {
    private int x, y;

    //create a constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //setters
    
}


public class distanceq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        //create two objects of point class
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        double distance = calculateDistance(p1, p2);
        System.out.printf("%.3f", distance);
    }

    public static double calculateDistance(Point p1, Point p2) {
        double distance = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
        return distance;
    }
}
