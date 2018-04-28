package ru.s1518.JavaExercises.Time;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Time time = new Time(23, 48, 34);
        time.addHour(5);
        System.out.println(time);
    }
}
