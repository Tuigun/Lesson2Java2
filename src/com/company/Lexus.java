package com.company;

public class Lexus extends Car implements Printable{
    public Lexus(String name, String model, int engine, String color, String steeringWeel) {
        super(name);
        this.name=name;
        this.model=model;
        this.engine=engine;
        this.color=color;
        this.steeringWeel=steeringWeel;
    }
    private String name;
    private String model;
    private  int engine;
    private  String color;
    private  String steeringWeel;

    public void print() {
        System.out.println("Марка "+name+"\n"+"Модель "+ model + "\n" + "engine" + engine + "\n" + "color"
                + color + "\n" + "streetweel" + steeringWeel +"\n");
    }

}


