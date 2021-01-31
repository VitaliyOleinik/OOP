import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        String name = in.next();
        try{
            Socket socket = new Socket("127.0.0.1", 2000); // localhost
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println("What do you want to do?");
                System.out.println(" Create [1] \n Update [2] \n Delete[3]");
                int choose = in.nextInt();
                if(choose == 1){
                    System.out.println("Which table do you want to Create?");
                    System.out.println(" Aircrafts [1] \n Cities [2] \n Flights [3]");
                    choose = in.nextInt();
                    if(choose == 1){

                    }else if(choose == 2){

                    }else if(choose == 3){

                    }
                }else if(choose == 2){
                    System.out.println("Which table do you want to Update?");
                    System.out.println(" Aircrafts [1] \n Cities [2] \n Flights [3]");
                    choose = in.nextInt();
                    if(choose == 1){

                    }else if(choose == 2){

                    }else if(choose == 3){

                    }
                }else if(choose == 3){
                    System.out.println("Which table do you want to Delete?");
                    System.out.println(" Aircrafts [1] \n Cities [2] \n Flights [3]");
                    choose = in.nextInt();
                    if(choose == 1){

                    }else if(choose == 2){

                    }else if(choose == 3){

                    }
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
