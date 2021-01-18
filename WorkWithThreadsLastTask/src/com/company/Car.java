package com.company;
import java.util.ArrayList;
import java.util.Map;

public class Car extends Thread{
    private String names;
    private int speed;
    private double distance;
    ArrayList<Integer> secondsArray = new ArrayList<Integer>();

    public Car(){}
    public Car(String names, int speed, double distance){
        this.names = names;
        this.distance = distance;
        this.speed = speed;
    }

    @Override
    public void run() {
        try{
            int seconds = 0, interval = 0;
            for(int i = 1; i <= this.distance; i++){
                if(interval >= distance) break;
                seconds += 1;
                interval += speed;
                System.out.println(getNames() + " is in " + interval + " meters!");
                Thread.sleep(1000);
            }
            secondsArray.add(seconds);
            System.out.println(names + " time " + seconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getNames() {
        return names;
    }
    public void setNames(String names) {
        this.names = names;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
