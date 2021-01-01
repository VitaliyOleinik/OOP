package com.company;

import java.util.Scanner;

public class Main {

    static void equation(){
        // write your code here 1/a + 1/a2 + 1/a4 + 1/a6 + ... + 1/a^2n
        double a;
        int n;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        n = in.nextInt();
        double sum = 1 /a;
        System.out.println(sum);
        for(int i = 1; i < n; i++){
            sum += 1/Math.pow(a, 2*n);
        }
        System.out.println(sum);
    }

    static void sumBetweenZeros(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            a[i] = x;
        }
        int cnt = 0, sum = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                cnt++;
            }
            if(cnt == 1){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumBetweenZeros();
    }
}
