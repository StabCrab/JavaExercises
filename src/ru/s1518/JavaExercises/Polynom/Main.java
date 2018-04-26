package ru.s1518.JavaExercises.Polynom;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws IOException {
            ArrayList<Integer> factor0 = new ArrayList<>();
            int degree = 3;
            int x = 4;
            for (int i = 0; i < degree; i++ )
                factor0.add(System.in.read());
            Polynom a = new Polynom (factor0, degree, x);
            System.out.println(a.getCounted(x));
            ArrayList<Integer> factor2 = new ArrayList<>();
            int degree1 = 3;
            int x1 = 4;
            for (int i = 0; i < degree1; i++ )
                factor2.add(System.in.read());
            Polynom b = new Polynom (factor2, degree1, x1);
            System.out.println(a.getCounted(x));
            System.out.println(a.Plus(a, b));
            System.out.println(a.Plus(a, b));
            System.out.println(a.Mn(a, b));
        }
    }
