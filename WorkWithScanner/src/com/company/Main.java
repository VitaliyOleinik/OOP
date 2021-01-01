package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here x4 + 4xy2 – 4yz + z4
        int x, y, z;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        System.out.println(Math.pow(x, 4) + 4*x*Math.pow(y, 2) - 4*y*z + Math.pow(z, 4));
    }
}
