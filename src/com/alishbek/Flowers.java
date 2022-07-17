package com.alishbek;

public class Flowers extends Plants{
    private Color colorOfLeaves;

    public Flowers(String place, Color color, int heightInCm, String name, String typeOfPlant, Color colorOfLeaves) {
        super(place, color, heightInCm, name, typeOfPlant);
        this.colorOfLeaves = colorOfLeaves;
    }


    @Override
    public void print() {
        System.out.println("Place: " + getPlace() +
                "\nColor: " + getColor() +
                "\nHeight(cm): " + getHeightInCm() +
                "\nName: " + getName() +
                "\nType of flower: "+getTypeOfPlant()+
                "\nColor of leaves: "+colorOfLeaves);

    }

    public Color getColorOfLeaves() {
        return colorOfLeaves;
    }
}
