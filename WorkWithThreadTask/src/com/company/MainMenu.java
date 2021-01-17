package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    protected JButton button;
    protected JLabel label;
    public MainMenu(){
        setSize(555, 555);
        setLayout(null);
        setTitle("Vit application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("FIRE!");
        button.setSize(333, 33);
        button.setLocation(99, 333);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    label.setLocation(label.getX() + 1, label.getY());
                    Thread.sleep(1000);
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });

        label = new JLabel("#");
        label.setSize(333, 123);
        label.setLocation(111, 22);
        add(label);
    }
}
