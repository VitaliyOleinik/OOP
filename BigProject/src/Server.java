import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;

public class Server {
    static Connection connection;
    static Socket socket;
    static ServerSocket server;
    public static void main(String[] args) {
        try{
            server = new ServerSocket(2000);
            System.out.println("Waiting for a client");
            Socket socket = server.accept();
            System.out.println("Client connected");
            connectionToDB();
            System.out.println("Complete to connection to database");
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            Aircrafts aircraft = null;
            Cities city = null;
            Flights flight = null;
            Tickets ticket = null;
            while(true){

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void connectionToDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_air_company?useUnicode=true&serverTimezone=UTC", "root",""
            );
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
