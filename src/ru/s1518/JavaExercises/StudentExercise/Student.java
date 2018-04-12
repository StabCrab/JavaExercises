package ru.s1518.JavaExercises.StudentExercise;

public class Student implements Comparable{
    private String surname;
    private int groupNumber;
    private int[] marks;
    private double avgMark;

    public Student(String name, int number, int[] mark){
        surname = name;
        groupNumber = number;
        marks = mark;

        for (int i = 0; i < marks.length; i++)
            avgMark += mark[i];

        avgMark /= marks.length;
    }

    public String getSurname(){
        return this.surname;
    }

    public  void setSurname(String surname){
        this.surname = surname;
    }
    public int getNumber(){
        return this.groupNumber;
    }


    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (this.avgMark > other.avgMark)
            return 1;
        else if (this.avgMark == other.avgMark)
            return 0;
        else
            return -1;
    }

    public boolean isPositive(){
        for (int i = 0; i < marks.length; i++)
            if (marks[i] < 4)
                return false;

        return true;
    }

    @Override
    public String toString() {
        return "STUDENT: " + surname + " GROUP: " + groupNumber + " AVG MARK: " + avgMark;
    }
}
