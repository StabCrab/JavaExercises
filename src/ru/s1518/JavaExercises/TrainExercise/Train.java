package ru.s1518.JavaExercises.TrainExercise;

public class Train {
    private String name;
    private int number;
    private int time;

    public Train(String name, int number, int time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
}
