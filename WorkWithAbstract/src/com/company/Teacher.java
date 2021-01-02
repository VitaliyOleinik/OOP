package com.company;

import javax.security.auth.Subject;
import java.util.Arrays;

public class Teacher extends User {
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;
    public Teacher(){}

    public Teacher(String[] subjects) {
        this.subjects = subjects;
    }
    public Teacher(String nickName, String status) {
        this.nickName = nickName;
        this.status = status;
    }
    public Teacher(String login, String password, String nickName, String status, String[] subjects) {
        super(login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
    }
    public Teacher(String nickName, String status, String[] subjects, int sizeOfSubjects) {
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }
    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }
    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public boolean addSubject(String subject){
        if(sizeOfSubjects < subjects.length){
            subjects[sizeOfSubjects] = subject;
            sizeOfSubjects++;
            return true;
        }
        return false;
    }

    @Override
    String getUserData() {
        System.out.println("Subjects: ");
        for(int i = 0; i < subjects.length; i++){
            System.out.print(subjects[i] + " .");
        }
        return "NickName: "+ nickName + ". Status " +status;
    }
}
