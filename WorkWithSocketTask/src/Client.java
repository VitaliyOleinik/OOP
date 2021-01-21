import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your name!");
        String name = in.nextLine();

        try{
            Socket socket = new Socket("127.0.0.1", 2000); // localhost
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            //ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println("PRESS [1] TO SEND MESSAGE");
                System.out.println("PRESS [2] TO EXIT");
                int choose = in.nextInt();
                if(choose == 1){
                    System.out.println("Insert message text:");
                    String message = in.next();
                    Date date = new Date();
                    MessageData messageData = new MessageData(name, message, date);
                    outputStream.writeObject(messageData);

                }else if(choose == 2){
                    System.out.println("Good Bye!!!");
                    return;
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
