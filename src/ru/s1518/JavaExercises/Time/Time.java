package ru.s1518.JavaExercises.Time;

import java.io.IOException;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour() throws IOException {
        this.hour = System.in.read();
    }

    public void setMinute() throws IOException {
        this.minute = System.in.read();
    }

    public void setSecond() throws IOException {
        this.second = System.in.read();
    }

    public void CheckTime(Time time) throws IOException {
        while (time.getHour() > 24 || time.getHour() < 0) {
            System.out.println("Wrong hour");
            time.setHour();
        }
        while (time.getMinute() > 60 || time.getMinute() < 0) {
            System.out.println("Wrong minute");
            time.setMinute();
        }
        while (time.getSecond() > 60 || time.getSecond() < 0) {
            System.out.println("Wrong second");
            time.setSecond();
        }
    }
    public void ChangeTime(Time time) throws IOException {
        time.setHour();
        time.setMinute();
        time.setSecond();
        time.CheckTime(time);
    }
}
