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
        return null;
    }

    @Override
    public String getPinCode() {
        return null;
    }

    @Override
    public void setPinCode(String pinCode) {

    }

    @Override
    public int totalBalance() {
        return 0;
    }

    @Override
    public void creditBalance(int credit) {

    }

    @Override
    public void debetBalance(int debet) {

    }

    @Override
    public String accountData() {
        return null;
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
