package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton addStudent;
    private JButton listStudents;
    private JButton exit;
    public MainMenu(){
        setSize(500, 500);
        setLayout(null);

        addStudent = new JButton("ADD STUDENT");
        addStudent.setSize(300, 30);
        addStudent.setLocation(100, 100);
        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showAddStudent();
            }
        });
        add(addStudent);

        listStudents = new JButton("LIST STUDENTS");
        listStudents.setSize(300, 30);
        listStudents.setLocation(100, 150);
        listStudents.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.showListStudents();
            }
        });
        add(listStudents);

        exit = new JButton("EXIT");
        exit.setSize(300, 30);
        exit.setLocation(100, 200);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.exitClient();
            }
        });
        add(exit);
    }
}
