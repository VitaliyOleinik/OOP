package com.company;

import java.util.ArrayList;

public class BankApplication {
    String name;
    ArrayList<Account> accounts = new ArrayList<Account>();

    public BankApplication(String name) {
        this.name = name;
    }

    void addAccount(Account a){
        try{
            accounts.add(a);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
    }
    void removeAccount(int i){
        try {
            accounts.remove(i);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the object is not exist");
        }
    }
    Account getMaxAccount(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).balance > max) {
                max = accounts.get(i).balance;
                index = i;
            }
        }
        return accounts.get(index);
    }
    double getAverageBalance(){
        double sum = 0;
        for (Account account : accounts) {
            sum += account.balance;
        }
        return sum / accounts.size();
    }
    double getTotalBalance(){
        double sum = 0;
        for (Account account : accounts) {
            sum += account.balance;
        }
        return sum;
    }
    int totalAccounts(){
        return accounts.size();
    }
    String getBankData(){
        return "Name of bank: " + name + ". Num of wallets: " + totalAccounts() + ". Sum of all balance: " + getTotalBalance() +
                            ". The average balance: " + getAverageBalance();
    }
}
