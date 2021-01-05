package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected FirstPage first;

    public MainFrame(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Vit Application");

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        first = new FirstPage();
        first.setVisible(false);
        add(first);
    }

    public void showFirst(){
        menu.setVisible(false);
        first.setVisible(true);
    }

    public void showMenu(){
        first.setVisible(false);
        menu.setVisible(true);
    }
}
