package com.company;

public class ThreadSample extends Thread{
    public String name;
    public ThreadSample(ThreadGroup threadGroup, String name){
        super(threadGroup, name);
    }

    public void run(){
        try{
            for(int i = 0; i < 5; i++){
                System.out.println(getName() + " " + i);
                Thread.sleep(500);
            }
        }catch (Exception e){

        }
    }

//    public void run(){
//        System.out.println("I'm thread!: " + getName());
//    }
}
