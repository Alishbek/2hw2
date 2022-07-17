package com.alishbek;

public abstract class Plants implements Printable{
    private String place;
    private Color color;
    private int HeightInCm;
    private String name;
    private String typeOfPlant;

    public Plants(String place, Color color, int heightInCm, String name, String typeOfPlant) {
        this.place = place;
        this.color = color;
        HeightInCm = heightInCm;
        this.name = name;
        this.typeOfPlant = typeOfPlant;
    }


    public String getPlace() {
        return place;
    }

    public Color getColor() {
        return color;
    }

    public int getHeightInCm() {
        return HeightInCm;
    }

    public String getName() {
        return name;
    }

    public String getTypeOfPlant() {
        return typeOfPlant;
    }


    }

