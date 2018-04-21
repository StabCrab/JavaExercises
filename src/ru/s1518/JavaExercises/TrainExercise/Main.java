package ru.s1518.JavaExercises.TrainExercise;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList<>();
            Train a = new Train("a", 0, 46);
            trains.add(a);
            Train b = new Train("a", 1, 41);
            trains.add(b);
            Train c = new Train("b", 2, 628);
            trains.add(c);
            Train d = new Train("e", 3, 541);
            trains.add(d);
            Train e = new Train("b", 4, 60);
            trains.add(e);
            KrivorykayaSortirovka.getSorted(trains);

        }

    }
