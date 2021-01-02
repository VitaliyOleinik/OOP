package com.company;

public class LiteratureBook extends Book{
    private String author;
    private int publishedYear;

    LiteratureBook(){}
    LiteratureBook(String name, String code, int pages, String author, int publishedYear){
        super();
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getBookData(){
        return "Author: " + author + ". Published year: " + publishedYear;
    }
}
