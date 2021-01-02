package com.company;

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("a", "a", 1, 20);
        Book book2 = new Book("b", "b", 2, 30);
        Book book3 = new Book("c", "c", 3, 40);
        Book book4 = new Book("d", "d", 4, 50);
        Book book5 = new Book("e", "e", 5, 60);
        Book book6 = new Book("f", "f", 6, 70);
        Book book7 = new Book("g", "g", 7, 80);
        Book book8 = new Book("k", "k", 8, 90);
        Book book9 = new Book("l", "l", 9, 100);

        Library library1 = new Library("Super", "Almaty");
        Library library2 = new Library("Duper", "Astana");
        if(library1.addBook(book1))
            System.out.println("OK!");
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);

        library2.addBook(book5);
        library2.addBook(book6);
        library2.addBook(book7);
        library2.addBook(book8);
        library2.addBook(book9);
        System.out.println(book1.toString());

        System.out.println("library 1: " + library1.size() + "   sum:  " + library1.priceSum());

        System.out.println("library 2: " + library2.size() + "   sum:  " + library2.priceSum());

        System.out.println(library1.toString());
    }
}