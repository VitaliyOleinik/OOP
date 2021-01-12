package com.company;

import java.util.Date;

// Данный класс нужен для записи продаж товара в магазине.
public class BuyHistory {
    String goodName;
    int goodPrice;
    Date buyTime;

    public BuyHistory(String goodName, int goodPrice){
        this.goodName = goodName;
        this.goodPrice = goodPrice;
        this.buyTime = new Date(); // для создания объекта текущего времени
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    @Override
    public String toString() {
        return "BuyHistory: " + "goodName = " + goodName + ", goodPrice = " + goodPrice +
                ", buyTime = " + buyTime;
    }

}
