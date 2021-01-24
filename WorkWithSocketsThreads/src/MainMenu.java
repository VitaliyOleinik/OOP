import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    protected JButton connect;
    protected JFrame IP;
    protected JFrame PORT;
    public MainMenu(){
        setSize(500, 500);
        setLayout(null);

        IP = new JFrame();
        IP.setSize(300, 30);
        IP.setLocation(100, 10);
        add(IP);

        PORT = new JFrame();
        PORT.setSize(300, 30);
        PORT.setLocation(100, 50);
        add(PORT);

        connect = new JButton("CONNECT!");
        connect.setSize(300, 30);
        connect.setLocation(100, 100);
        add(connect);
//        connect.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MainFrame.
//            }
//        });
    }
}
