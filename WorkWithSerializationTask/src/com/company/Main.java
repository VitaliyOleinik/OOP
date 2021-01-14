package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose;
        while(true){
            System.out.println("PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("PRESS 3 TO PLAY GAME");
            System.out.println("PRESS 0 TO EXIT");
            choose = in.nextInt();
            if(choose == 1){
                System.out.println("Game name:");
                String name = in.next();
                System.out.println("IP address:");
                String ipAddress = in.next();
                System.out.println("PORT:");
                int port = in.nextInt();
                Game game1 = new Game(name, ipAddress, port);
                saveGame(game1);
            }else if(choose == 2){
                System.out.println("CHOOSE GAME:");

                System.out.println("Nickname:");
                String nickname = in.next();
                System.out.println("Rating:");
                double rating = in.nextDouble();
                Players player = new Players(nickname, rating);
                addPlayers(player);
            }else if(choose == 3){
                try{
                    Game gameInfo = new Game();
                    gameInfo.toString();
                    System.out.println("List of players: ");
                    for(int i = 0; i < gameInfo.players.size(); i++){
                        System.out.print(gameInfo.players.get(i) + ", ");
                    }
                }catch (Exception e){
                    System.out.println("No Players!");
                }
            }else if(choose == 0){
                return;
            }
        }
    }

    static ArrayList<Game> readGame(){
        ArrayList<Game> games = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            games = (ArrayList<Game>)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return games;
    }

    static void saveGame(Game game){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(game);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    static void addPlayers(Players player){

    }

}
