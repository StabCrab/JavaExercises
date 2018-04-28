package ru.s1518.JavaExercises.Time;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Time time = new Time(12, 48, 34);
            time.CheckTime(time);
            time.ChangeTime(time);
    }
}
