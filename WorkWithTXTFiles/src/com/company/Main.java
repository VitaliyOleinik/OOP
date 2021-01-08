package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        try{
//        // FileWriter file = new FileWriter("input.txt");
//        BufferedWriter bw =
//                new BufferedWriter(
//                        new FileWriter("input.txt"));
//        String message = in.next();
//        bw.write(message);
//        bw.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }

//        try{
//            BufferedReader br = new BufferedReader(
//                    new FileReader("input.txt"));
//            String message = "";
//            while ((message = br.readLine()) != null){
//                System.out.println(message);
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        ArrayList<String> products = new ArrayList<>();
        File file = new File("input.txt");
        if(file.exists()){
            products = readProducts();
        }
        while (true){
            System.out.println("[1] ADD PRODUCT");
            System.out.println("[2] LIST PRODUCTS");
            System.out.println("[3] DELETE PRODUCT");
            int choise = in.nextInt();
            if(choise == 1){
                System.out.println("Inset new product");
                String product = in.next();
                products.add(product);
                writeProducts(products);
            }else if(choise == 2){
                products = readProducts();
                for(String prod : products){
                    System.out.println(prod);
                }
            }else if(choise == 3){
                System.out.println("Insert index!");
                int index = in.nextInt();
                if(index >= 0 && index < products.size()){
                    products.remove(index);
                    writeProducts(products);
                }
            }
        }
    }

    public static ArrayList<String> readProducts(){
        ArrayList<String> products = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(
                    new FileReader("input.txt"));
            String message = "";
            while ((message = br.readLine()) != null){
                products.add(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return products;
    }

    public static void writeProducts(ArrayList<String> products){
        try{
            BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("input.txt"));
            for(String prod : products){
                bw.write(prod + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
