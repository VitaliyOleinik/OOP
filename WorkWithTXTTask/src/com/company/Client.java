package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

public class Client {
    ArrayList<GoodItem> goodItems = new ArrayList<>();
    ArrayList<BuyHistory> buyHistory = new ArrayList<>();

    ArrayList<GoodItem> getGoodItemList(){
        try{
            goodItems.clear();
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String nameOfGoodItem = "";
            while((nameOfGoodItem = br.readLine()) != null){
                int price = Integer.parseInt(br.readLine()); //Вытягиваем цену сконвертировав в int
                goodItems.add(new GoodItem(nameOfGoodItem, price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return goodItems;
    }
    ArrayList<BuyHistory> getBuyHistory(){
        try {
            buyHistory.clear();
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String nameOfGood = "";
            while((nameOfGood = br.readLine()) != null){
                int price = Integer.parseInt(br.readLine());
                String date = br.readLine();
                buyHistory.add(new BuyHistory(nameOfGood, price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return buyHistory;
    }
    void saveBuyHistory(ArrayList<BuyHistory> buyHistory){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));
            for(BuyHistory buyHistoryIterator : buyHistory){
                bw.write(buyHistoryIterator.goodName + "\n");
                bw.write(buyHistoryIterator.goodPrice + "\n");
                bw.write(buyHistoryIterator.buyTime + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
