package com.company;

public class Operation extends Thread{
    String operationName;
    int operationTime;

    public Operation(){}
    public Operation(String operationName, int operationTime){
        this.operationName = operationName;
        this.operationTime = operationTime;
    }
    @Override
    public void run() {
        try{
            System.out.println("Operation "+ this.operationName +" : started");
            for(int i = 1; i <= operationTime; i++){
                System.out.println("Operation\"" + this.operationName + "\" : "+ i + " second.");
                Thread.sleep(1000);
            }
            System.out.println("Operation \" "+ this.operationName + "\" : finished");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
