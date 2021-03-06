import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = in.next();

        try{
            Socket socket = new Socket("127.0.0.1", 2000); // localhost
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println("Insert message!");
                String message = in.next();
                PackageData packageData = new PackageData(name, message);
                outputStream.writeObject(packageData);
                if((packageData = (PackageData) inputStream.readObject()) != null){
                    System.out.println(packageData.getMessage());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
