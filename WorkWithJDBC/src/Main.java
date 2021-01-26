import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //http://localhost/phpmyadmin/ -> local DB
    private static Connection connection;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User>users = new ArrayList<>();
        connectionToDB();
        while(true){
            System.out.println("[1] ADD USER");
            System.out.println("[2] LIST USERS");
            System.out.println("[3] EDIT USER");
            System.out.println("[4] DELETE USER");
            System.out.println("[0] EXIT");
            int choice = in.nextInt();
            if(choice == 1) {
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert surname");
                String surname = in.next();
                System.out.println("Insert age:");
                int age = in.nextInt();
                User user = new User(null, name, surname, age);
                addUser(user);
            }else if(choice == 2){
                users = getAllUsers();
                for(User u: users){
                    System.out.println(u);
                }
            }else if(choice == 3){
                System.out.println("Insert ID of user");
                Long id = in.nextLong();
                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert surname");
                String surname = in.next();
                System.out.println("Insert age:");
                int age = in.nextInt();
                User user = new User(id, name, surname, age);
                updateUser(user);
            }else if(choice == 4){
                System.out.println("Insert ID of user");
                Long id = in.nextLong();
                deleteUser(id);
            }else if(choice == 0){
                return;
            }
        }
    }

    public static void deleteUser(Long id){
        try {
        PreparedStatement statement
                = connection.prepareStatement
                ("delete from users where id = ?");
            statement.setLong(1, id);
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(User u){
        try{
            PreparedStatement statement
                    = connection.prepareStatement
                    ("update users set name = ?, surname = ?, age = ? where id = ?");
            statement.setString(1, u.getName());
            statement.setString(2, u.getSurName());
            statement.setInt(3, u.getAge());
            statement.setLong(4, u.getId());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addUser(User u){
        try{
            PreparedStatement statement
                    = connection.prepareStatement
                    ("insert into users(name, surname, age) values(?,?,?)");
            statement.setString(1, u.getName());
            statement.setString(2, u.getSurName());
            statement.setInt(3, u.getAge());
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        try{
            // statement for sql request
            PreparedStatement statement = connection.prepareStatement("select * from users");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                users.add(new User(id, name, surname, age));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }

    static void connectionToDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_test?useUnicode=true&serverTimezone=UTC", "root", ""
            );
            System.out.println("Connected!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
