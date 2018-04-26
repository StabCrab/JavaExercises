package ru.s1518.JavaExercises.Rectangle;

public class Rectangle {
    private Point a;
    private Point b;

    public Rectangle (Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public void moveX(int x) {
        this.a.moveX(x);
        this.b.moveX(x);
    }
    public void moveY(int y) {
        this.a.moveY(y);
        this.b.moveY(y);
    }
    public void resizeX(int x){
        this.a.moveX(x);
}
    public void resizeY(int y){
        this.b.moveY(y);
    }

    public static Rectangle union(Rectangle rect1, Rectangle rect2) {
        int maxX = Point.maxX(rect1.a, rect1.b, rect2.a, rect2.b);
        int maxY = Point.maxY(rect1.a, rect1.b, rect2.a, rect2.b);
        int minX = Point.minX(rect1.a, rect1.b, rect2.a, rect2.b);
        int minY = Point.minY(rect1.a, rect1.b, rect2.a, rect2.b);
        Point a = new Point (maxX, maxY);
        Point b = new Point(minX, minY);
        return new Rectangle(a, b);
    }

    public static Rectangle intersect(Rectangle rect1, Rectangle rect2) {
        if ( rect1.a.getY() < rect2.b.getY() && rect1.b.getY() > rect2.a.getY() || rect1.b.getX() < rect2.a.getX() && rect1.a.getX() > rect2.b.getX() ){
            int maxX = Point.comX(rect1.a, rect2.a);
            int maxY = Point.comY(rect1.a, rect2.a);
            int minX = Point.comX1(rect1.b, rect2.b);
            int minY = Point.comY1(rect1.b, rect2.b);
            Point a = new Point (maxX, maxY);
            Point b = new Point(minX, minY);
            return new Rectangle(a, b);

        }
            return null;

    }

    @Override
    public String toString() {
        return a + " - " + b;
    }
}

