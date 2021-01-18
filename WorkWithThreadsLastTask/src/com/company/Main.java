package com.company;

import java.util.ArrayList;

public class Main {
    private final static double distance = 1000;
    static ArrayList<Integer> secondsArray = new ArrayList<Integer>();
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 100, distance);
        Car car2 = new Car("Toyota", 150, distance);
        Car car3 = new Car("Lexus", 200, distance);
        car1.start();
        car2.start();
        car3.start();

        //System.out.println(tg.activeCount());
        //for(tg.activeCount())
//        if(!car1.isAlive() && !car2.isAlive() && !car3.isAlive()){
//            System.out.println("Good job");
//        }

    }
//    public static void main(String[] args) {
//
//        CarThread c1 = new CarThread("Mercedes", 30, 5);
//        CarThread c2 = new CarThread("Toyota", 25, 10);
//
//        c1.start();
//        c2.start();
//
//    }
}
