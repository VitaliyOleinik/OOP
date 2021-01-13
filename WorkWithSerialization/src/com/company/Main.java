package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        File file = new File("input.txt");
        if(file.exists()){
            users = readUsers();
        }
        while(true){
            System.out.println("[1] ADD USER");
            System.out.println("[2] LIST USERS");
            System.out.println("[3] DELETE USER");
            System.out.println("[0] EXIT");
            int choise = in.nextInt();
            if(choise == 1){
                System.out.println("Insert id");
                int id = in.nextInt();
                System.out.println("Insert name");
                String name = in.next();
                User user = new User(id, name);
                users.add(user);
                writeUSers(users);
            }else if(choise == 2){
                users = readUsers();
                for(User u : users){
                    System.out.println(u.toString());
                }
            }else if(choise == 3){
                System.out.println("Insert index");
                int index = in.nextInt();
                if(index >= 0 && index < users.size()){
                    users.remove(index);
                    writeUSers(users);
                }
            }else if(choise == 0){
                return;
            }
        }
    }

    public static void writeUSers(ArrayList<User> users){
        try{
            ObjectOutputStream outputStream
                    = new ObjectOutputStream(new FileOutputStream("input.txt"));
            outputStream.writeObject(users);
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> readUsers(){
        ArrayList<User> users = new ArrayList<>();
        File file = new File("input.txt");
        try {
            // checking for file existence
            if(file.exists()){
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input.txt"));
                users = (ArrayList<User>) inputStream.readObject();
            }else{
                System.out.println("No such FILE!!!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
}
