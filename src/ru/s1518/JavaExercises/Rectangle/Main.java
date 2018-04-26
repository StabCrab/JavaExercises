package ru.s1518.JavaExercises.Rectangle;

public class Main {
    public static void main(String[] args) {

//        Point a = new Point(1, 1);
//        Point b = new Point(3, 3);
//        Point c = new Point(2,2);
//        Point d = new Point (4,5);
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2,2);
        Point d = new Point (3,3);
        Rectangle rectangle = new Rectangle(a, b);
//        rectangle.moveX(1);
//        rectangle.moveY(2);
        Rectangle rectangle1 = new Rectangle(c, d);
//        rectangle1.resizeX(3);
//        rectangle.resizeY(5);

        Rectangle rectangle3 = Rectangle.intersect(rectangle, rectangle1);
        Rectangle rectangle2 = Rectangle.union(rectangle, rectangle1);
//        System.out.println(rectangle);
//        System.out.println(rectangle1);
        System.out.println(rectangle3);
        System.out.println(rectangle2);
    }
}
