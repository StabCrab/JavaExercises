package ru.s1518.JavaExercises.StudentExercise;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        int[] marksa = new int[]{5, 4, 3};
        int[] marksb = new int[]{2, 5, 4};
        int[] marksc = new int[]{5, 5, 5};
        int[] marksd = new int[]{3, 3, 3};
        int[] markse = new int[]{2, 2, 2};
        int[] marksf = new int[]{2, 3, 5};
        int[] marksg = new int[]{4, 5, 5};
        int[] marksh = new int[]{3, 4, 5};
        int[] marksi = new int[]{4, 5, 4};
        int[] marksj = new int[]{4, 4, 4};

        Student a = new Student("Trishin N", 1, marksa);
        students.add(a);
        Student b = new Student("Lol K", 1, marksb);
        students.add(b);
        Student c = new Student("Nevsky A", 2, marksc);
        students.add(c);
        Student d = new Student("Sobolev N", 2, marksd);
        students.add(d);
        Student e = new Student("MCHovansky U", 3, markse);
        students.add(e);
        Student f = new Student("Larin A", 3, marksf);
        students.add(f);
        Student g = new Student("Putin V", 4, marksg);
        students.add(g);
        Student h = new Student("Navalny A", 4, marksh);
        students.add(h);
        Student i = new Student("Druzhko S", 5, marksi);
        students.add(i);
        Student j = new Student("Reptile H", 5, marksj);
        students.add(j);

        Table table = new Table(students);

        for (int z: table.getPositiveGroupNumbers())
            System.out.println("GOOD GROUP: " + z);

        for (String str: table.getPositiveSurnames())
            System.out.println("GOOD STUDENT: " + str);

        for (Student st: table.getSortedStudents())
            System.out.println(st);
    }
}

