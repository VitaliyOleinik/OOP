package com.company;

import java.util.InputMismatchException;

public class Library {
    String name;
    String city;
    Book books[] = new Book[2];
    int index = 0;

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

    public void addBook(Book book){
        try{
            books[index] = book;
            index++;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        } catch (InputMismatchException e){
            System.out.println("It is not a number");
        }
    }

    public void printBooks(){
        for(int i = 0; i < index; i++){
            try {
                System.out.println(books[i].getData());
            }catch (NullPointerException e){
                System.out.println("The book is empty");
            }
        }
    }


}
