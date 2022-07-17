package com.alishbek;

public class Main {

    public static void main(String[] args) {
        // write your code here
        createObject("1");
        System.out.println();
        createObject("2");
        System.out.println();
        createObject("3");



    }

    public static void createObject(String className) {
        //1-grass, 2-trees, 3-flowers
        switch (className) {
            case "1":
                Grass grass = new Grass("Hill", Color.GREEN, 8, "grass", "default grass");
                grass.print();
                break;
            case "2":
                Trees tree = new Trees("Forest", Color.WHITE, 560, "tree", "birch tree", Color.GREEN);
                tree.print();
                break;
            case "3":
                Flowers flower = new Flowers("New York City", Color.GREEN, 15, "flower", "Rose", Color.RED);
                flower.print();
                break;
        }
    }
}

