import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread extends Thread{
@Override
    public  void run() {
        try{
            ServerSocket serverSocket = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            ObjectInputStream inputStream1 = new ObjectInputStream(socket.getInputStream());
            ObjectInputStream inputStream2 = new ObjectInputStream(socket.getInputStream());
            MessageData messageData = null;
            MessageData messageData1 = null;
            while ((messageData = (MessageData) inputStream1.readObject()) != null && (messageData1 = (MessageData) inputStream2.readObject()) != null){
                System.out.println(messageData.toString());
                System.out.println(messageData1.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
