import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton connect;
    protected JTextField IP;
    protected JTextField PORT;
    public MainMenu(){
        setSize(500, 500);
        setLayout(null);

        IP = new JTextField("IP");
        IP.setSize(300, 30);
        IP.setLocation(100, 10);
        add(IP);

        PORT = new JTextField("PORT");
        PORT.setSize(300, 30);
        PORT.setLocation(100, 50);
        add(PORT);

        connect = new JButton("CONNECT!");
        connect.setSize(300, 30);
        connect.setLocation(100, 100);
        connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ipText = IP.getText();
                int portInt = 0;
                try{
                    portInt = Integer.parseInt(PORT.getText());
                }catch(Exception ex){
                    ex.printStackTrace();
                }

                boolean check = Client.connectToServer(ipText,portInt);
                if(check){
                    Client.frame.showMessageGUI();
                }
            }
        });
        add(connect);
    }

}
