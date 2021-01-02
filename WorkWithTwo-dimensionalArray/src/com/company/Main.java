package com.company;

import java.util.Scanner;

public class Main {

    static void isEqual(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][]arr = new int[2][n];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        boolean check = true;
        for(int i = 0; i < n; i++){
            if(arr[0][i] != arr[1][i])
                check = false;
        }
        if(!check) System.out.println("No!");
        else System.out.println("Yes!");
    }

    static void negativeToX(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]arr= new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] < 0)
                    System.out.print("x ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void counterNegative(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]arr= new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] < 0) cnt++;
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }

    static void diagonalToX(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][]arr= new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j)
                    System.out.print("x ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void symmetricDiagonals(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][]arr= new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j && arr[i][j] == arr[i][j + i])
                    System.out.print("x ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumOfElements(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]arr= new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum = 0;
        for(int i = 1; i < n; i+=2){
            for(int j = 1; j < m; j+=2){
                sum += arr[i][j];
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        System.out.println(sumOfElements());
    }
}
