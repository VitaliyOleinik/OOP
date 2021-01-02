package com.company;

public class Main {

    public static void main(String[] args) {
	    Library library = new Library("Super", "Almaty", "KZ");
	    Book book1 = new ScientificBook("Science1", "123", 123, 10, "Krutoy1");
        Book book2 = new ScientificBook("Science2", "123", 123, 20, "Krutoy2");
        Book book3 = new ScientificBook("Science3", "123", 123, 30, "Krutoy3");
        Book book4 = new ScientificBook("Science4", "123", 123, 40, "Krutoy4");
        Book book5 = new LiteratureBook("Literature1", "321", 321, "Super1", 2000);
        Book book6 = new LiteratureBook("Literature2", "321", 321, "Super2", 2001);
        Book book7 = new LiteratureBook("Literature3", "321", 321, "Super3", 2002);
        Book book8 = new LiteratureBook("Literature4", "321", 321, "Super4", 2003);
        Book book9 = new LiteratureBook("Literature5", "321", 321, "Super5", 2004);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);


        library.printLibraryData();
    }
}
