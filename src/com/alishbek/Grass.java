package com.alishbek;

public class Grass extends Plants {


    public Grass(String place, Color color, int heightInCm, String name, String typeOfPlant) {
        super(place, color, heightInCm, name, typeOfPlant);
    }

    @Override
    public void print() {
        System.out.println("Place: " + getPlace() +
                "\nColor: " + getColor() +
                "\nHeight(cm): " + getHeightInCm() +
                "\nName: " + getName() +
                "\nType of grass: "+getTypeOfPlant());

    }
}
