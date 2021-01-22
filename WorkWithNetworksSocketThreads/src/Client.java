import java.net.*;
import java.io.*;
import java.util.*;
public class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert name");
        ArrayList<String> catchedNames = new ArrayList<String>();
        String name = sc.next();
        try{

            Socket socket = new Socket("127.0.0.1",1997);
            ObjectOutputStream outStream =
                    new ObjectOutputStream(socket.getOutputStream());

            ObjectInputStream in =
                    new ObjectInputStream(socket.getInputStream());

            while(true){
                System.out.println("Insert message");
                String message = sc.next();
                outStream.writeObject(message);

                PackageData pd = null;

                if((pd=(PackageData)in.readObject())!=null){
                    catchedNames = pd.names;
                    for(String s: catchedNames){
                        System.out.println(s);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}