import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MessageGUI extends Container {
    protected JLabel label;
    protected JTextField textField;
    protected JButton back;
    protected JButton submit;

    MessageGUI(){
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("Please, insert your message");
        label.setSize(300,30);
        label.setLocation(100,100);
        add(label);

        textField = new JTextField();
        textField.setSize(300, 30);
        textField.setLocation(100, 140);
        add(textField);

        back = new JButton("BACK!");
        back.setSize(300, 30);
        back.setLocation(100, 400);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client.frame.showMenu();
            }
        });
        add(back);

        submit = new JButton("SUBMIT!");
        submit.setSize(300, 30);
        submit.setLocation(100, 240);
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String messageText = textField.getText();
                Client.sendMessage(messageText);
                textField.setText("");
            }
        });
        add(submit);
    }
}
