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

        if (!checkTime())
            throw new RuntimeException("Fuck you");
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void addHour(int hour) {
        this.hour += hour;
        this.hour %= 24;
    }
    public void addMinute(int minute) {
        this.minute += minute;
        this.minute %= 60;
    }
    public void addSecond(int second) {
        this.second += second;
        this.second %= 60;
    }

    private boolean checkTime() {
        if (this.getHour() > 24 || this.getHour() < -1) {
            System.out.println("Wrong hour");
            return false;
        }
        if (this.getMinute() > 60 || this.getMinute() < 0) {
            System.out.println("Wrong minute");
            return false;
        }
        if (this.getSecond() > 60 || this.getSecond() < 0) {
            System.out.println("Wrong second");
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return (getHour() + ":" + getMinute() + ":" + getSecond());
    }
}
