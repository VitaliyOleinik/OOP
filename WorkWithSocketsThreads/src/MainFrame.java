import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected MessageGUI messageGUI;
    public MainFrame(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Vit Application");

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        messageGUI = new MessageGUI();
        messageGUI.setVisible(false);
        add(messageGUI);
    }
    public void showMessageGUI(){
        menu.setVisible(false);
        messageGUI.setVisible(true);
    }
    public void showMenu(){
        menu.setVisible(true);
        messageGUI.setVisible(false);
    }

}
