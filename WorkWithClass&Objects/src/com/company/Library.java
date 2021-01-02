package com.company;

import java.util.Arrays;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getSizeOfBooks() {
        return sizeOfBooks;
    }

    public void setSizeOfBooks(int sizeOfBooks) {
        this.sizeOfBooks = sizeOfBooks;
    }

    public int size(){
        return sizeOfBooks;
    }

    public int priceSum(){
        int sum = 0;
        for(int i = 0; i < sizeOfBooks; i++)
            if(size() != 0)
                sum += books[i].getPrice();
        return sum;
    }

    public Book getBook(int index){
        return books[index];
    }

    public boolean addBook(Book book){
        if(sizeOfBooks < books.length) {
            books[sizeOfBooks] = book;
            sizeOfBooks++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", books=" + Arrays.toString(books) +
                ", sizeOfBooks=" + sizeOfBooks +
                '}';
    }
}
