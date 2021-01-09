package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
class Admin{
    public static void saveGoodItems(ArrayList<GoodItem> goodItem){
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter("goodItems.txt"));
                for(GoodItem goods : goodItem){
                    bw.write(goods.getName() + "\n");
                    bw.write(goods.getPrice() + "\n");
                    bw.close();
            }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
}
