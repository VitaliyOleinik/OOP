package com.company;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;

public class Server {
    static Connection connection;
    static ArrayList<Students> students;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            Socket socket = server.accept();
            System.out.println("Client connected");
            connectionToDB();
            while(true){
                PackageData packageData = new PackageData();
                if(packageData.operationType.equals("ADD")){
                    System.out.println(packageData.getStudent().toString());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void connectionToDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_students?useUnicode=true&serverTimezone=UTC", "root",""
            );
            System.out.println("Connected to DB!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void addStudent(Students student){
        try{
            PreparedStatement statement =
                    connection.prepareStatement("insert into students(name, surname, age) values(?,?,?)");
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
                    connection.prepareStatement("delete from students where id = ?");
            statement.setLong(1, id);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static ArrayList<Students> getAllStudents(){
        ArrayList<Students> students = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("select * from students");
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                students.add(new Students(id, name, surname, age));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    protected static void exitServer(){
        System.exit(1);
    }

}
