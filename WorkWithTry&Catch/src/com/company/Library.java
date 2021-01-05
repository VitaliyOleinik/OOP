package com.company;

public class Library {
    String name;
    String city;
    Book books[] = new Book[20];
    int index = 0;

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

    public boolean addBook(Book book){
        if(index < books.length){
            books[index] = book;
            index++;
            return true;
        }
        return false;
    }
}
