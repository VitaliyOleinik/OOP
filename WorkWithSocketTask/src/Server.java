import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Serializable {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            MessageData messageData = null;
            while ((messageData = (MessageData) inputStream.readObject()) != null){
                System.out.println(messageData.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
