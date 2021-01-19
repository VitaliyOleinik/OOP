import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            Socket socket = server.accept();
            System.out.println("Client connected");
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            String message = "";
            while((message = (String) inputStream.readObject()) != null){
                System.out.println(message);
                if(message.toLowerCase().contains("hello")){
                    outputStream.writeObject("HELLO FROM SERVER!");
                }else{
                    outputStream.writeObject(null);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
