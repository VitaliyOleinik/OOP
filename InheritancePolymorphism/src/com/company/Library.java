package com.company;

public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100]; //Для данного массива не создавайте геттер и сеттер
    private int sizeOfBooks = 0; //Для данного типа не создавайте геттер и сеттер

    Library() {}// Конструктор по умолчанию
    Library(String name, String city, String country){
        this.name = name;
        this.city = city;
        this.country = country;
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
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public void addBook(Book book) { // данный метод добавляет книгу в массив используя курсор sizeOfBooks
        if(sizeOfBooks < books.length){
            books[sizeOfBooks] = book;
            sizeOfBooks++;
        }
    }

    public void printLibraryData(){
        System.out.println(getCity() + "    " + getCountry() + "   " + getName());
        for (int i = 0; i < books.length; i++){
            if(books[i] != null)
                System.out.println(books[i].getBookData());
        }
    }
}
