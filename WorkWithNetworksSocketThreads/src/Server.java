import java.net.*;
import java.io.*;
import java.util.*;
public class Server{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Messi");
        names.add("Ronaldo");
        names.add("Modric");
        names.add("Marcelo");
        names.add("Navas");

        try{
            ServerSocket server = new ServerSocket(1997);
            System.out.println("waiting for client");

            while(true){
                Socket socket = server.accept();
                System.out.println("Client connected");
                PackageData pd = new PackageData(names);
                ClientHandler ch = new ClientHandler(socket,pd);
                ch.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}