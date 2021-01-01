package com.company;

import java.util.Scanner;

public class Main {

    static void task1(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
//        char[] chars = s.toCharArray();
//        for(int i = 0; i < chars.length; i++){
//            if()
//        }
        for(int i = 0; i < s.length() / 2; i++){
            if(s.indexOf(i) == s.indexOf(s.length()- 1 - i)){
                System.out.println("yes");
            }
            else System.out.println("no");
        }
    }

    static void task2(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'i' || s.charAt(i) == 'e') {
                sum++;
            }
        }
        System.out.println(sum);
    }
    static void task3(){
        String s1, s2;
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        s2 = in.next();
        if(s1.contains(s2)) System.out.println("yes");
        else System.out.println("no");
    }
    static void task4(){
        String s1, s2;
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        s2 = in.next();
        char[] temp = s2.toCharArray();
        char[] reverseS2 = s2.toCharArray();

        for(int i = 0; i < temp.length; i++){
            reverseS2[i] = temp[temp.length - 1 - i];
        }
        s2 = new String(reverseS2);
        if(s1.equals(s2)) System.out.println("yes");
        else System.out.println("no");
    }

    static void task5(){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] a = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            if(a[i] >= 'a' && a[i] <= 'z')
                a[i] = (char) (a[i] - 32);
            else if(a[i] >= 'A' && a[i] <= 'Z')
                a[i] = (char) (a[i] + 32);
        }
        s = new String(a);
        System.out.println(s);
    }

    static void task6() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] a1 = new char[s.length() * 2];
        for (int i = 0, j = 0; j < s.length(); i+=2, j++) {
            a1[i] = s.charAt(j);
            a1[i+1] = s.charAt(j);
        }
        s = new String(a1);
        System.out.println(s);
    }
    public static void main(String[] args) {
        task6();
    }
}
