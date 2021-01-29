package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllStudentsFrame extends Container {
    protected JLabel label;
    protected JButton back;
    public AllStudentsFrame(){
        setSize(500,500);
        setLayout(null);

        label = new JLabel("List STUDENT");
        label.setLocation(100,100);
        label.setSize(100,30);
        add(label);

        back = new JButton("BACK");
        back.setLocation(100,150);
        back.setSize(300,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
                Main.frame.repaint();
            }
        });
        add(back);
    }
}
