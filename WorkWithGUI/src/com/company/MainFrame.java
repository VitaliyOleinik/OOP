package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    // array(Class Integer) for Option
    private Integer[]ages = new Integer[100];

    public MainFrame(){
        for(int i = 0; i < 100; i++){
            ages[i] = i;
        }
        // layout
        setSize(500, 500);
        setTitle("Vit Application");
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
                    jLabel.setText(txt + " : " + age);
                    textField.setText("");
                    agesBox.setSelectedItem(0);
                }
            }
        });
    }
}
