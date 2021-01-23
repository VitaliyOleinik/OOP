import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

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
                ClientHandler clientHandler = new ClientHandler(socket, id);
                clientHandler.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
