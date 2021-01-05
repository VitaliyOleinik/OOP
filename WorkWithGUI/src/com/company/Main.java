package com.company;

import javax.swing.*;

public class Main {
    public static MainFrame frame;
    public static void main(String[] args) {
        frame = new MainFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
