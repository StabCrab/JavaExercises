package ru.s1518.JavaExercises.Rectangle;

public class Point {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveX(int x){
        this.x += x;
    }

    public void moveY(int y){
        this.y += y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static int maxX(Point a, Point b, Point c, Point d){
        int max1 = Math.max(a.getX(), b.getX());
        int max2 = Math.max(c.getX(), d.getX());
        return Math.max(max1, max2);
    }

    public static int maxY(Point a, Point b, Point c, Point d){
        int max1 = Math.max(a.getY(), b.getY());
        int max2 = Math.max(c.getY(), d.getY());
        return Math.max(max1, max2);
    }

    public static int minX(Point a, Point b, Point c, Point d){
        int min1 = Math.min(a.getX(), b.getX());
        int min2 = Math.min(c.getX(), d.getX());
        return Math.min(min1, min2);
    }

    public static int minY (Point a, Point b, Point c, Point d){
        int min1 = Math.min(a.getY(), b.getY());
        int min2 = Math.min(c.getY(), d.getY());
        return Math.min(min1, min2);
    }
    public static int comX(Point a, Point b){
        return Math.max(a.getX(), b.getX());
    }

    public  static int comY(Point a, Point b){
        return Math.max(a.getY(), b.getY());
    }
    public static int comX1(Point a, Point b) {
        return Math.min(a.getX(), b.getX());
    }
    public static int comY1(Point a, Point b) {
        return Math.min(a.getY(), b.getY());
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
