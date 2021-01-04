package com.company;

public class DataBase {
    public static BankAccount allAccounts[] = new BankAccount[10];
    static{
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev","KZ010322312","0102", 20000);
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek","KZ010322313","0101", 10000);
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev","KZ0101112","0102", 2000);
        allAccounts[3] = new NationalBankAccount("Vitaliy Oleinik","KZ0111111","7777", 1999999999);
        allAccounts[4] = new NationalBankAccount("Nurik","KZ0111132","7777", 199999999);
        allAccounts[5] = new NationalBankAccount("Alisher","KZ0111211","7127", 19999999);
        allAccounts[6] = new NationalBankAccount("Dias","KZ0111451","7477", 1999999);
        allAccounts[7] = new NationalBankAccount("Artem","KZ0116511","7657", 199999);
        allAccounts[8] = new CityBankAccount("Sanya","Dunglangesh","KZ012","1102", 202002120);
        allAccounts[9] = new CityBankAccount("Zangar","Usen","KZ010376313","0122", 100003122);
        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов
    }
}
