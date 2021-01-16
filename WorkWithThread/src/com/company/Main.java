package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("MyGroup");
        ThreadSample ts1 = new ThreadSample(tg, "first");
        ThreadSample ts2 = new ThreadSample(tg, "second");
        ThreadSample ts3 = new ThreadSample(tg, "third");

        ts1.start();
        ts2.start();
        ts3.start();
        System.out.println(tg.activeCount());
        // чтобы сперва сработали треды, а только затем остальной код
        while (tg.activeCount() > 0){

        }
        System.out.println("Hello");
    }
}
