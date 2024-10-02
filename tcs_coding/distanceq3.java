package tcs_coding;

import java.io.*;
import java.util.*;
import java.math.*;


class Point {
    private int x, y;

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
}

class distanceq3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        //create three objects of Points class
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        Point ans = pointWithHighestOriginDistance(p1, p2, p3);
        System.out.println(ans.getX());
        System.out.println(ans.getY());

    }

    public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3) {
        double d1 = Math.sqrt(Math.pow(p1.getX(), 2)+Math.pow(p1.getY(), 2));
        double d2 = Math.sqrt(Math.pow(p2.getX(), 2)+Math.pow(p2.getY(), 2));
        double d3 = Math.sqrt(Math.pow(p3.getX(), 2)+Math.pow(p3.getY(), 2));

        if(d1 > d2 && d1 > d3 )
            return p1;
        if(d2 > d1 && d2 > d3)
            return p2;

        return p3;
    }
}
