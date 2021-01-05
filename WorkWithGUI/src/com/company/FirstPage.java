package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends Container {
    // array(Class Integer) for Option
    private Integer[]ages = new Integer[100];

    public FirstPage(){
        for(int i = 0; i < 100; i++){
            ages[i] = i;
        }
        // layout
        setSize(500, 500);
        setLayout(null);
        // info String
        JLabel jLabel = new JLabel("Hello! This is Vit Application!");
        jLabel.setSize(300, 30);
        jLabel.setLocation(100, 100);
        add(jLabel);
        // Text Field
        JTextField textField = new JTextField();
        textField.setSize(300, 30);
        textField.setLocation(100, 140);
        add(textField);
        // Option for app
        JComboBox agesBox = new JComboBox(ages);
        agesBox.setSize(300, 30);
        agesBox.setLocation(100, 180);
        add(agesBox);
        // Text Area
        JTextArea textArea = new JTextArea();
        textArea.setSize(300, 100);
        textArea.setLocation(100, 250);
        textArea.setEditable(false); // User cannot change data of text area
        add(textArea);
        // button
        JButton button = new JButton("Submit!");
        button.setSize(300, 30);
        button.setLocation(100, 220);
        add(button);
        // Action Listener -> Interface for button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = textField.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!txt.equals("")){
                    textArea.append(txt + " : " + age + "\n");
                    textField.setText("");
                    agesBox.setSelectedItem(0);
                }
            }
        });

        JButton back = new JButton("Back");
        back.setSize(300, 30);
        back.setLocation(100, 370);
        add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
            }
        });
    }
}
