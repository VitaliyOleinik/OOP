package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static void firstTask(){
        Operation o1 = new Operation("operation 1", 4);
        Operation o2 = new Operation("operation 2", 3);
        Operation o3 = new Operation("operation 3", 2);
        Operation o4 = new Operation("operation 4", 1);
        o1.start();
        o2.start();
        o3.start();
        o4.start();
    }
    static void secondTask(){
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        firstTask();
        secondTask();
    }
}
