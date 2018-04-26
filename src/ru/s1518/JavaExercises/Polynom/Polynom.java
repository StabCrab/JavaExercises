package ru.s1518.JavaExercises.Polynom;

import java.util.ArrayList;

public class Polynom {
    private ArrayList<Integer> factor;
    private int degree;
    private int x;

    public Polynom(ArrayList<Integer> factor, int degree, int x) {
        this.factor = factor;
        this.degree = degree;
        this.x = x;
    }
    public int getCounted(int x){
        int sum = 0;
        for (int i = 0; i < degree; i++){
            sum += this.factor.get(i) * Math.pow(x, degree);
        }
        return sum;
    }

    public int getCounted() {
        int sum = 0;
        for (int i = 0; i < degree; i++){
            sum += this.factor.get(i) * Math.pow(x, degree);
        }
        return sum;
    }
    public Polynom Plus(Polynom a, Polynom b){
        ArrayList<Integer> factorex = new ArrayList<>();
        for (int i = 0; i < degree; i++) {
            factorex.add(i, a.factor.get(i) + b.factor.get(i));
        }
            Polynom c = new Polynom(factorex, degree, x);
        System.out.println(c.getDegree());
        System.out.println(c.getFactor());
        System.out.println(c.getX());
            return c;
    }
    public Polynom  Minus(Polynom a, Polynom b){
        ArrayList<Integer> factorex = new ArrayList<>();
        for (int i = 0; i < degree; i++) {
            factorex.add(i, a.factor.get(i) - b.factor.get(i));
        }
        Polynom c = new Polynom(factorex, degree, x);
        System.out.println(c.getDegree());
        System.out.println(c.getFactor());
        System.out.println(c.getX());
        return c;
    }
    public Polynom Mn (Polynom a, Polynom b){
        ArrayList<Integer> factorex = new ArrayList<>();
        for (int i = 0; i < degree; i++) {
            factorex.add(i, (int) (a.factor.get(i) * Math.pow(x, degree) * b.factor.get(i) * Math.pow (x, degree)));
        }
        Polynom c = new Polynom(factorex, degree, x);
        System.out.println(c.getDegree());
        System.out.println(c.getFactor());
        System.out.println(c.getX());
        return c;
    }

    public ArrayList<Integer> getFactor() {
        return factor;
    }

    public int getDegree() {
        return degree;
    }
    public int getX() {
        return x;
    }

}