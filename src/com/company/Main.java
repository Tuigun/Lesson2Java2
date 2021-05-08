package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Mersedes");
        createObject("Lexsus");
        createObject("Toyota");

    }
    private static Car createObject(String className) {
        switch (className) {
            case "Mersedes":
                MersedesBens mersedesBens = new MersedesBens("Mersedes", "S", 4, "white", "left");
                mersedesBens.print();
               return mersedesBens;
            case "Lexsus":
                Lexus lexus = new Lexus("Lexus", "Ls", 5, "Black", "Left");
                lexus.print();
                return lexus;
            case "Toyota":
                Toyota toyota = new Toyota("Toyota", "Highlander", 3, "Blue", "left");
                toyota.print();
                return toyota;
            case "Audi":
                Audi audi = new Audi("Audi", "A7", 5, "exlusive Black", "left");
                audi.print();
                return audi;
        }


        return null;
    }}