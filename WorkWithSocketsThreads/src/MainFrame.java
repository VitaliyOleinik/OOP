import javax.swing.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    public MainFrame(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("VitApplication");


    }
    public void showFirst(){
        menu.setVisible(false);
        //.setVisible(true);
    }
}
