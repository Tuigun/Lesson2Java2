package com.company;

public class MersedesBens extends Car implements Printable{

    private String model;
    private  int engine;
    private  String color;
    private  String steeringWeel;
    private String nameMark;
    public MersedesBens(String name, String model, int engine, String color, String steeringWeel) {
        super(name);
        this.nameMark=name;
        this.model=model;
        this.engine=engine;
        this.color=color;
        this.steeringWeel=steeringWeel;
    }



    public void print() {
        System.out.println("Марка "+nameMark+"\n"+"Модель "+ model + "\n" + "engine " + engine + "\n" + "color"
        + color + "\n" + "streetweel" + steeringWeel +"\n");
    }

}
