package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentFrame extends Container {
    protected JTextField name;
    protected JLabel nameText;
    protected JTextField surname;
    protected JLabel surnameText;
    protected JTextField age;
    protected JLabel ageText;
    protected JButton addStudent;
    protected JButton back;

    public AddStudentFrame(){
        setSize(500, 500);
        setLayout(null);


        nameText = new JLabel("NAME:");
        nameText.setSize(50, 30);
        nameText.setLocation(150, 100);
        add(nameText);
        name = new JTextField();
        name.setSize(100, 30);
        name.setLocation(250, 100);
        add(name);

        surnameText = new JLabel("SURNAME:");
        surnameText.setSize(70, 30);
        surnameText.setLocation(150, 150);
        add(surnameText);
        surname = new JTextField();
        surname.setSize(100, 30);
        surname.setLocation(250, 150);
        add(surname);

        ageText = new JLabel("AGE:");
        ageText.setSize(50, 30);
        ageText.setLocation(150, 200);
        add(ageText);
        age = new JTextField();
        age.setSize(100, 30);
        age.setLocation(250, 200);
        add(age);

        back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(100, 250);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showMenu();
                Main.frame.repaint();
            }
        });
        add(back);

        addStudent = new JButton("ADD");
        addStudent.setSize(100, 30);
        addStudent.setLocation(250, 250);
        add(addStudent);
    }
}
