package ru.saton.test10;

public class Computer {
    CDRom cdr = new CDRom();
    HDD hdd = new HDD();

    void start(){
        System.out.println("I start");
    }
    void work(){
        cdr.readCD();
        hdd.delete();
        cdr.writeCD();
        hdd.load();
    }
    void off(){
        System.out.println("I stop");
    }

}
