package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
    static Connection connection;
    static MainFrame frame;
    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

    static void addStudent(Students student){
        try{
            PreparedStatement statement =
                    connection.prepareStatement("insert into items(name, surname, age) values(?,?,?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setInt(3, student.getAge());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void deleteStudent(Long id){
        try{
            PreparedStatement statement =
                    connection.prepareStatement("delete from items where id = ?");
            statement.setLong(1, id);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static ArrayList<Students> getAllStudents(){
        ArrayList<Students> items = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("select * from items");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                items.add(new Students(id, name, surname, age));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return items;
    }

    protected static void exit(){
        System.exit(1);
    }
}
