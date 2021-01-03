package com.company;

public class MCDonalds implements Restaurant {
    private int burgersPrices[] = new int[100];
    private int workersSalary[] = new int[20];
    private int burgersSize = 0;
    private int workersSize = 0;

    public void addBurger(int burgerPrice) // Данный метод добавляет цену бургера в список
    {
        if(burgersSize < burgerPrice){
            burgersPrices[burgersSize] = burgerPrice;
            burgersSize++;
        }
    }
    public void addWorker(int workerSalary) // Данный метод добавляет зарплату рабочего
    {
        if(workersSize < workersSalary.length){
            workersSalary[workersSize] = workerSalary;
            workersSize++;
        }
    }

    @Override
    public double getTotalIncome() {
        int sum = 0;
        for(int i = 0; i < burgersSize; i++){
            sum += burgersPrices[i];
        }
        return sum;
    }

    @Override
    public double getTotalOutcome() {
        int sum = 0;
        for(int i = 0; i < workersSize; i++){
            sum += workersSalary[i];
        }
        return sum;
    }
}
