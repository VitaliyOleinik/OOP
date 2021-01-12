package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose;
        System.out.println("Who are you? "+"\n"+" [1] Admin " + "\n" + " [2] Client");
        choose = in.nextInt();
        if (choose == 1) {
            Admin admin = new Admin();
            while (true) {
                System.out.println("PRESS [1] ADD GOOD");
                System.out.println("PRESS [2] LIST GOODS");
                System.out.println("PRESS [3] DELETE GOOD");
                System.out.println("PRESS [0] TO EXIT");
                choose = in.nextInt();
                if(choose == 1){
                    System.out.println("Write the name of good");
                    String name = in.next();
                    System.out.println("Write the price of this good");
                    int price = in.nextInt();
                    // create new object
                    GoodItem gI = new GoodItem(name, price);
                    // read list with new object
                    ArrayList<GoodItem> goodItems = admin.getGoodItemList();
                    // adding an object to list
                    goodItems.add(gI);
                    // write to txt file
                    admin.saveGoodItems(goodItems);
                }else if(choose == 2){
                    ArrayList<GoodItem> goodItems = admin.getGoodItemList();
                    for (int i = 0; i < goodItems.size(); i++){
                        System.out.println(goodItems.get(i).toString());
                    }
                    System.out.println(goodItems.size());
                }else if(choose == 3){
                    ArrayList<GoodItem> goodItems = admin.getGoodItemList();
                    for (int i = 0; i < goodItems.size(); i++){
                        System.out.println(goodItems.get(i).toString());
                    }
                    System.out.println("Insert index of good item to delete: ");
                    int index = in.nextInt(); //Вводим порядковый номер игрока из списка от 1 до размера
                    goodItems.remove(index - 1);
                    admin.saveGoodItems(goodItems);
                }else if(choose == 0){
                    return;
                }
            }
        }else if(choose == 2){
            Client client = new Client();
            while (true){
                System.out.println("PRESS [1] LIST GOODS");
                System.out.println("PRESS [2] BUY GOOD");
                System.out.println("PRESS [3] LIST BUY HISTORY");
                System.out.println("PRESS [0] TO EXIT");
                // TEST!!!!!
//                BuyHistory good1 = new BuyHistory("bread", 1);
//                ArrayList<BuyHistory> goodItems1 = new ArrayList<>();
//                goodItems1.add(good1);
//                client.saveBuyHistory(goodItems1);
                //
                choose = in.nextInt();
                if(choose == 1){
                    ArrayList<GoodItem> goodItems = client.getGoodItemList();
                    for (int i = 0; i < goodItems.size(); i++){
                        System.out.println(goodItems.get(i).toString());
                    }
                    System.out.println(goodItems.size());
                }else if(choose == 2){
                    System.out.println("Write the name of good");
                    String name = in.next();
                    System.out.println("Write the price of this good");
                    int price = in.nextInt();
                    // create new object
                    BuyHistory bh = new BuyHistory(name, price);
                    // read list with new object
                    ArrayList<BuyHistory> buyHistories = client.getBuyHistory();
                    // adding an object to list
                    buyHistories.add(bh);
                    // write to txt file
                    client.saveBuyHistory(buyHistories);
                }else if(choose == 3){
                    ArrayList<BuyHistory> buyHistories = client.getBuyHistory();
                    for(int i = 0; i < buyHistories.size(); i++){
                        System.out.println(buyHistories.get(i).toString());
                    }
                    System.out.println(buyHistories.size());
                }else if(choose == 0){
                    return;
                }
            }
        }

    }
}
