package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Library library1 = new Library("City", "Almaty");
        Book book1 = new Book(1, "Alice", "Author");
        int id;
        String name, author;

        Book book2 = new Book(id = in.nextInt(), name = in.next(), author = in.next());
        Book book3 = new Book(3, "The Hitchen", "Duglos");
        library1.addBook(book1);
        library1.addBook(book2);
        library1.printBooks();
    }
}
