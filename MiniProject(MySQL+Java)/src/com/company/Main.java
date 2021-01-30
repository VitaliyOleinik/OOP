package com.company;

import javax.swing.*;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {
    static MainFrame frame;
    static Socket socket;

    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        connectionToServer();
    }

    static void connectionToServer(){
        try{
            socket = new Socket("localhost", 2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected static void exitClient(){
        System.exit(1);
    }
}
