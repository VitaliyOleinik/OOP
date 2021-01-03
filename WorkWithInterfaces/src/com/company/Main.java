package com.company;

public class Main {

    public static void main(String[] args) {
        MCDonalds mcDonalds1 = new MCDonalds();
        MCDonalds mcDonalds2 = new MCDonalds();
        KFC kfc = new KFC();

        mcDonalds1.addBurger(10);
        mcDonalds1.addWorker(9);
        mcDonalds2.addBurger(15);
        mcDonalds2.addWorker(11);

        kfc.addBasket(25);

        City city1 = new City("Almaty");
        city1.addRestaurant(mcDonalds1);
        city1.addRestaurant(mcDonalds2);
        city1.addRestaurant(kfc);

        System.out.println(kfc.getTotalIncome());

        System.out.println(mcDonalds1.getTotalIncome());
        System.out.println(mcDonalds1.getTotalOutcome());

        System.out.println(city1.getTotalTax());
    }
}
