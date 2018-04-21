package ru.s1518.JavaExercises.TrainExercise;

import java.util.ArrayList;
import java.util.Objects;

public class KrivorykayaSortirovka {
    public static void getSorted(ArrayList<Train> trains){
        int num = 1;
        Train ex;
        for (int i=0; i< trains.size(); i++)
        {
            if (trains.get(i).getNumber() == num){
                System.out.print(trains.get(num).getName());
                System.out.print(trains.get(num).getTime());
            }
        }
        boolean f=true;
        ArrayList<Train> extra = new ArrayList<>();
        for (int i = 0; i < trains.size(); i++)
        {
            for (int k = 0; k < extra.size(); k++){
                if (extra.get(k).getName() == trains.get(i).getName())
                    f=false;
            }
            for (int g = i; g < trains.size(); g++){
                if ((Objects.equals(trains.get(i).getName(), trains.get(g).getName()) && (f)))
                    extra.add(trains.get(g));
            }
            f = true;
        }
        trains = extra;
        for (int i = 0; i < trains.size(); i++)
            System.out.println(trains.get(i).getName());

        for (int i = 0; i < trains.size(); i++)
        {
            for (int g = i+1; g < trains.size(); g++)
                if (trains.get(i).getName() == trains.get(g).getName() && trains.get(i).getTime() > trains.get(g).getTime()){
                    ex = trains.get(i);
                    trains.add(i, trains.get(g));
                    trains.remove(i+1);
                    trains.add(g, ex);
                    trains.remove(g+1);
                }
        }
        for (int i = 0; i < trains.size(); i++)
            System.out.println(trains.get(i).getTime());
    }
}
