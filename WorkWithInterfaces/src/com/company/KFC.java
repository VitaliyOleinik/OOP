package com.company;

public class KFC implements Restaurant {
    private int basketPrices[] = new int[100];
    private int basketSize = 0;

    public void addBasket(int basketPrice) // Данный метод добавляет цену баскета в список
    {
        if(basketSize < basketPrices.length){
            basketPrices[basketSize] = basketPrice;
            basketSize++;
        }
    }

    @Override
    public double getTotalIncome() {
        int sum = 0;
        for(int i = 0; i < basketSize; i++){
            sum += basketPrices[i];
        }
        return sum;
    }

    @Override
    public double getTotalOutcome() {
        return 0;
    }
}
