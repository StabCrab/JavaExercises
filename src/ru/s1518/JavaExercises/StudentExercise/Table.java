package ru.s1518.JavaExercises.StudentExercise;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Table {
    private ArrayList<Student> students;

    public Table(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getSortedStudents() {
        ArrayList<Student> copy = (ArrayList<Student>) students.clone();
        Collections.sort(copy);
        return copy;
    }

    public ArrayList<String> getPositiveSurnames() {
        ArrayList<String> surnames = new ArrayList<>();

        for (int i = 0; i < students.size(); i++)
            if (students.get(i).isPositive())
                surnames.add(students.get(i).getSurname());

        return surnames;
    }

    public ArrayList<Integer> getPositiveGroupNumbers() {
        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
           if (students.get(i).isPositive() && !number.contains(students.get(i).getNumber()))
                number.add(students.get(i).getNumber());
        }

        return number;
    }
}
