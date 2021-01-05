package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    protected JButton first;
    protected JButton second;

    public MainMenu(){
        setSize(500, 500);
        setLayout(null);
        first = new JButton("First Page");
        first.setSize(300, 30);
        first.setLocation(100, 100);
        add(first);
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showFirst();
            }
        });

        second = new JButton("Second Page");
        second.setSize(300, 30);
        second.setLocation(100, 1400);
        add(second);
    }
}
