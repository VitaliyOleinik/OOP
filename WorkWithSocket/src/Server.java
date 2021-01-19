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
            PackageData packageData = null;
            while((packageData = (PackageData) inputStream.readObject()) != null){
                System.out.println(packageData.toString());
                if(packageData.getMessage().toLowerCase().contains("hello")){
                    packageData.setMessage("HELLO FROM SERVER!");
                    outputStream.writeObject(packageData);
                }else{
                    outputStream.writeObject(null);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
