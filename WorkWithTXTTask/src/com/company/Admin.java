package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
class Admin{
    ArrayList<GoodItem> goodItems = new ArrayList<>();
    public ArrayList<GoodItem> getGoodItemList(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String message = "";
            while((message = br.readLine()) != null){
               // goodItems.add(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void saveGoodItems(ArrayList<GoodItem> goodItem){
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
