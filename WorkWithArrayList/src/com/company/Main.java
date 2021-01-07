package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication1 = new BankApplication("Sber");
        BankApplication bankApplication2 = new BankApplication("Forte");
        BankApplication bankApplication3 = new BankApplication("Kaspi");
        Account account1 = new Account(1, "Vit", "Ole", 353);
        Account account2 = new Account(1, "Vit", "Ole", 678);
        Account account3 = new Account(1, "Vit", "Ole", 987);
        Account account4 = new Account(1, "Vit", "Ole", 213);
        Account account5 = new Account(1, "Vit", "Ole", 36);
        Account account6 = new Account(1, "Vit", "Ole", 567);
        Account account7 = new Account(1, "Vit", "Ole", 768);
        Account account8 = new Account(1, "Vit", "Ole", 534);
        Account account9 = new Account(1, "Vit", "Ole", 987);
        Account account10 = new Account(1, "Vit", "Ole", 324);
        Account account11 = new Account(1, "Vit", "Ole", 234);
        Account account12 = new Account(1, "Vit", "Ole", 234);
        Account account13 = new Account(1, "Vit", "Ole", 756);
        Account account14 = new Account(1, "Vit", "Ole", 755);
        Account account15 = new Account(1, "Vit", "Ole", 456);
        bankApplication1.addAccount(account1);
        bankApplication1.addAccount(account2);
        bankApplication1.addAccount(account3);
        bankApplication1.addAccount(account4);
        bankApplication1.addAccount(account5);
        bankApplication2.addAccount(account6);
        bankApplication2.addAccount(account7);
        bankApplication2.addAccount(account8);
        bankApplication2.addAccount(account9);
        bankApplication2.addAccount(account10);
        bankApplication3.addAccount(account11);
        bankApplication3.addAccount(account12);
        bankApplication3.addAccount(account13);
        bankApplication3.addAccount(account14);
        bankApplication3.addAccount(account15);

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(bankApplication1);
        allBanks.add(bankApplication2);
        allBanks.add(bankApplication3);

        for(int i = 0; i < allBanks.size(); i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }
}
