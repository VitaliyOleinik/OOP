package com.company;

public class CarThread extends Thread{
    private String name;
    private int speed;
    private int seconds;


    public CarThread(){

    }

    public CarThread(String name, int speed, int seconds){
        this.name = name;
        this.speed = speed;
        this.seconds = seconds;
    }

    @Override
    public void run(){

        try{

            int distance = 0;

            for(int i=0;i<this.seconds;i++){
                //System.out.println(this.name + " at " + distance + " meters");
                distance = distance + speed;
                Thread.sleep(1000);
            }

            System.out.println(this.name + " at " + distance + " meters");

        }catch(Exception e){

        }

    }
}
