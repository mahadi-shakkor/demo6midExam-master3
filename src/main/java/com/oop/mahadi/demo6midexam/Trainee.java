package com.oop.mahadi.demo6midexam;

import java.util.ArrayList;

public class Trainee {

    int id;
    ArrayList<String> trainingTaitels;

    public Trainee() {
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", trainingTaitels=" + trainingTaitels +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getTrainingTaitels() {
        return trainingTaitels;
    }

    public void setTrainingTaitels(ArrayList<String> trainingTaitels) {
        this.trainingTaitels = trainingTaitels;
    }

    public Trainee(int id, ArrayList<String> trainingTaitels) {
        this.id = id;
        this.trainingTaitels = trainingTaitels;
    }
}
