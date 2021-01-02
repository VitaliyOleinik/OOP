package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String login;
        String password;
        String name;
        String surname;
        String group;
        String nickName;
        String status;
        double GPA;
        int id;
        User student = new Student();
        User teacher = new Teacher();
        String subject[] = new String[0];
	    /*

        PRESS [2] TO LIST USERS



              PRESS [1] TO LIST STUDENTS

              PRESS [2] TO LIST TEACHERS
              */
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("PRESS [1] TO ADD USER OR PRESS [0] TO FINISH");
            System.out.println("PRESS [2] TO LIST USERS");
            int n = in.nextInt();
            if(n == 1){
                System.out.println("PRESS [1] TO ADD STUDENT OR PRESS [2] TO ADD TEACHER");
                n = in.nextInt();
                if(n == 1){
                    login = in.next();
                    password = in.next();
                    group = in.next();
                    GPA = in.nextDouble();
                    student = new Student(login, password, group, GPA);
                }else if(n == 2){
                    login = in.next();
                    password = in.next();
                    nickName = in.next();
                    status = in.next();
                    teacher = new Teacher(login, password, nickName, status, subject);
                    System.out.println("PRESS [1] TO ADD SUBJECT OR PRESS [0] TO FINISH ADDING SUBJECT");
                    n = in.nextInt();
                    if(n == 1){
                        for(int i = 0; i <= 1; i++){
                            subject[i] = in.next();
                        }
                    }else if(n == 0){
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        continue;
                    }
                }


            }
            if(n == 2){
                System.out.println("PRESS [1] TO LIST STUDENTS");
                System.out.println("PRESS [2] TO LIST TEACHERS");
                n = in.nextInt();
                if(n == 1){
                    student.getUserData();
                }else if(n == 2){
                    teacher.getUserData();
                }

            }
            else if(n == 0){
                System.out.println("GOOD BYE!");
                return;
            }
        }
    }
}
