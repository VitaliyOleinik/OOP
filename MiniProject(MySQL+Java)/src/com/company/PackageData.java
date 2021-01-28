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

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

}
