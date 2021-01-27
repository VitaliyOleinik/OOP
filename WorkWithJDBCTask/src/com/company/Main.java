package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Connection connection;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Items> items;
        connectionToDB();
        while(true){
            System.out.println("PRESS [1] TO ADD ITEMS");
            System.out.println("PRESS [2] TO LIST ITEMS");
            System.out.println("PRESS [3] TO DELETE ITEMS");
            System.out.println("[0] EXIT");
            int choice = in.nextInt();
            if(choice == 1) {
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert price:");
                double price = in.nextDouble();
                Items item = new Items(null, name, price);
                addItem(item);
            }else if(choice == 2){
                items = getAllItems();
                for(Items i: items){
                    System.out.println(i);
                }
            }else if(choice == 3){
                System.out.println("Insert ID of user");
                Long id = in.nextLong();
                deleteItem(id);
            }else if(choice == 0){
                return;
            }
        }
    }

    static void connectionToDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_items?useUnicode=true&serverTimezone=UTC", "root",""
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void addItem(Items item){
        try{
            PreparedStatement statement =
                    connection.prepareStatement("insert into items(name, price) values(?,?)");
            statement.setString(1, item.getName());
            statement.setDouble(2, item.getPrice());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void deleteItem(Long id){
        try{
            PreparedStatement statement =
                    connection.prepareStatement("delete from items where id = ?");
            statement.setLong(1, id);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static ArrayList<Items>getAllItems(){
        ArrayList<Items> items = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("select * from items");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                items.add(new Items(id, name, price));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return items;
    }
}
