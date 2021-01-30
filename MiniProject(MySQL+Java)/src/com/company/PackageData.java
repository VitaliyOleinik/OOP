package com.company;

import java.util.ArrayList;

public class PackageData {
    String operationType;
    ArrayList<Students> students;
    Students student;

    public PackageData(){}
    public PackageData(String operationType){
        this.operationType = operationType;
    }
    public PackageData(String operationType, ArrayList<Students> students) {
        this.operationType = operationType;
        this.students = students;
    }
    public PackageData(String operationType, ArrayList<Students> students, Students student) {
        this.operationType = operationType;
        this.students = students;
        this.student = student;
    }
    public PackageData(String operationType, Students student) {
        this.operationType = operationType;
        this.student = student;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }
    public Students getStudent() {
        return student;
    }
    public void setStudent(Students student) {
        this.student = student;
    }
    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
