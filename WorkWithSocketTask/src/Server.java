import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    public static void main(String[] args) {
        try {
            ServerThread serverThread = new ServerThread();
            serverThread.start();
            //ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
