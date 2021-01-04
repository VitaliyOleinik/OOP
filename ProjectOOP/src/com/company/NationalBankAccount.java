package com.company;

public class NationalBankAccount implements BankAccount {
    String fullName;
    int balance;
    String accountNumber;
    String pinCode;

    public NationalBankAccount(){}

    public NationalBankAccount(String fullName, String accountNumber, String pinCode, int balance) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if(balance + 200 >= credit && balance >= 0){
            balance -= credit;
        }else{
            System.out.println("You don't have enough money!");
        }
    }

    @Override
    public void debetBalance(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "NationalBankAccount{" +
                "fullName='" + fullName + '\'' +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
