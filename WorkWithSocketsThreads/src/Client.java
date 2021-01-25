import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static MainFrame frame;
    public static Socket socket;
    public static ObjectOutputStream outStream;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = in.next();
        frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void sendMessage(String message){
        try{
            outStream.writeObject(message);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static boolean connectToServer(String ip, int port){
        boolean check = false;
        try{
            socket = new Socket(ip,port);
            outStream = new ObjectOutputStream(socket.getOutputStream());
            check = true;
        }catch(Exception e){
            e.printStackTrace();
            check = false;
        }
        return check;
    }


}
