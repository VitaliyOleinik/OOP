package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose;
        ArrayList<String> goodItems = new ArrayList<>();
        System.out.println("Who are you? "+"\n"+" [1] Admin " + "\n" + " [2] Client");
        choose = in.nextInt();
        if (choose == 1) {
            while (true) {
                System.out.println("PRESS [1] ADD GOOD");
                System.out.println("PRESS [2] LIST GOODS");
                System.out.println("PRESS [3] DELETE GOOD");
                System.out.println("PRESS [0] TO EXIT");
            }
        }
    }
}
