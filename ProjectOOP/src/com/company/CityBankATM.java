package com.company;

import java.util.Scanner;

public class CityBankATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lengthOfArray = DataBase.allAccounts.length;
        boolean checkLogin = false;
        boolean checkPassword = false;
        boolean checkOfBank = false;
        int index = 0;

        System.out.println("Please write your Account Number");
        String login = in.next();
        System.out.println("Please write your Pin Code");
        String password = in.next();
        //check for login and password
        for(int i = 0; i < lengthOfArray; i ++){
            if(DataBase.allAccounts[i].getAccountNumber().equals(login)){
                checkLogin = true;
                index = i;
                if(DataBase.allAccounts[i] instanceof CityBankAccount) {checkOfBank = true;}
            }
            if(DataBase.allAccounts[i].getPinCode().equals(password)){
                checkPassword = true;
            }
            if((!checkPassword || !checkLogin) && i == lengthOfArray){
                System.out.println("Some wrong in your login or password");
                return;
            }
            if(checkLogin && checkPassword){
                System.out.println("Welcome!");
                break;
            }
        }
        // ATM
        if(checkOfBank){
            System.out.println("This bank is City Bank");
            while (true){
                int chooseKey;
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");

                chooseKey = in.nextInt();
                switch (chooseKey){
                    case 1:{
                        System.out.println("How many cash do you want to withdrawal?");
                        int cash = in.nextInt();
                        DataBase.allAccounts[index].creditBalance(cash);
                        break;
                    }
                    case 2:{
                        System.out.println("Your cash on cart is: " + DataBase.allAccounts[index].totalBalance());
                        break;
                    }
                    case 3:{
                        String newPinCode;
                        System.out.println("Please Write Pin Code");
                        DataBase.allAccounts[index].setPinCode(newPinCode = in.next());
                        break;
                    }
                    case 4:{
                        System.out.println("Please give me all your money!");
                        int cash = in.nextInt();
                        DataBase.allAccounts[index].debetBalance(cash);
                        break;
                    }
                    case 5:{
                        System.out.println(DataBase.allAccounts[index].accountData());
                        break;
                    }
                    case 6:{
                        System.out.println("Good Bye!");
                        return;
                    }

                }


            }
        }
        else if(!checkOfBank){
            System.out.println("This is National Bank");
            while (true){
                int chooseKey;
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                chooseKey = in.nextInt();
                switch (chooseKey) {
                    case 1:{
                        System.out.println("How many cash do you want to withdrawal?");
                        int cash = in.nextInt();
                        DataBase.allAccounts[index].creditBalance(cash + 200);
                        break;
                    }
                    case 2:{
                        System.out.println("Your cash on cart is: " + DataBase.allAccounts[index].totalBalance());
                        break;
                    }
                    case 3:{
                        System.out.println("Good Bye!");
                        return;
                    }
                }
            }
        }
    }
}
