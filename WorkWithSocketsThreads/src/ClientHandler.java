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
            PackageData packageData = null;
            while((packageData = (PackageData) inputStream.readObject()) != null) {
                System.out.println("CLIENT ID: " + this.id + ". " +packageData.toString());
                if (packageData.getMessage().toLowerCase().contains("hello")) {
                    packageData.setMessage("HELLO FROM SERVER!");
                    outputStream.writeObject(packageData);
                } else {
                    outputStream.writeObject(null);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
