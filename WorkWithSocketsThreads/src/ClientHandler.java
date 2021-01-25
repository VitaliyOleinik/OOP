import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler extends Thread{
    private Socket socket;
    private int id;
    public ClientHandler(Socket socket, int id){
        this.socket = socket;
        this.id = id;
    }
    public void run(){
        try{
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            String message = null;
            while((message = (String)inputStream.readObject()) != null){
                System.out.println(message);
                System.out.println("CLIENT ID: " + this.id + ". "  + message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
