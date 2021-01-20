import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name!");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1", 2000); // localhost
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
