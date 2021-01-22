import java.util.*;
import java.io.*;
import java.net.*;
public class ClientHandler extends Thread{
    private Socket socket;
    private PackageData pd;

    public ClientHandler(Socket socket, PackageData pd){
        this.socket = socket;
        this.pd = pd;
    }

    public void run(){
        try{
            ObjectInputStream in = new
                    ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outStream =
                    new ObjectOutputStream(socket.getOutputStream());

            String message = "";
            while((message=(String)in.readObject())!=null){
                System.out.println(message);

                if(message.equals("list")){
                    outStream.writeObject(pd);
                }else{
                    outStream.writeObject(null);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}