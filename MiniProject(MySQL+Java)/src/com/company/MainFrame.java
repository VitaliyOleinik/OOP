package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
    protected MainMenu menu;
    protected AddStudentFrame addStudent;
    protected AllStudentsFrame allStudents;
    public MainFrame(){
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setTitle("Vit Application");

        menu = new MainMenu();
        menu.setVisible(true);
        add(menu);

        addStudent = new AddStudentFrame();
        addStudent.setVisible(false);
        add(addStudent);

        allStudents = new AllStudentsFrame();
        allStudents.setVisible(false);
        add(allStudents);
    }
    public void showAddStudent(){
        menu.setVisible(false);
        allStudents.setVisible(false);
        addStudent.setVisible(true);
    }
    public void showMenu(){
        menu.setVisible(true);
        allStudents.setVisible(false);
        addStudent.setVisible(false);
    }
    public void showListStudents(){
        allStudents.setVisible(true);
        menu.setVisible(false);
        addStudent.setVisible(false);
    }
}
