package com.company;

import java.util.Scanner;

public class Main {
    static void existTriangle(){
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if(a + b > c && a + c > b && b + c > a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static void isHitLadia(){
        int x, y, x1, y1;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        x1 = in.nextInt();
        y1 = in.nextInt();
        if(x == x1 || y == y1) System.out.println("Yes");
        else System.out.println("No");
    }

    static void isHitSlon(){
        int x, y, x1, y1;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        x1 = in.nextInt();
        y1 = in.nextInt();
        if(x + y == x1 + y1 || x - y == x1 - y1) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String[] args) {
	// write your code here
        isHitSlon();
    }
}
