package ru.s1518.JavaExercises.TwoVariablesExercise;

public class Variables {
    private int first;
    private int second;

    public Variables(int first, int second){
        this.first = first;
        this.second = second;
    }
    public int getSum(){
        return (this.first + this.second);
    }

    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.second;
    }
    public void setAB(int a, int b){
        this.first = a;
        this.second = b;
    }
    public int getMax(){
        if (this.first > this.second)
            return this.first;
        else
            return this.second;
    }
}
