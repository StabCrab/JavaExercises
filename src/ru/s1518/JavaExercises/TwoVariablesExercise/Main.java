package ru.s1518.JavaExercises.TwoVariablesExercise;
public class Main {
    public static void main(String[] args) {
        Variables wat = new Variables(3, 5);
        System.out.println(wat.getFirst());
        System.out.println(wat.getSecond());
        System.out.println(wat.getSum());
        wat.setAB(4, 5);
        System.out.println(wat.getFirst());
        System.out.println(wat.getSecond());
        System.out.println(wat.getSum());
        System.out.println(wat.getMax());
    }
}
