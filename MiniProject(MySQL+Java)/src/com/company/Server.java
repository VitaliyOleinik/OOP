package com.company;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int id = 0;
        try {
            ServerSocket server = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            while(true){
                Socket socket = server.accept();
                id++;
                System.out.println("Client connected");
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
