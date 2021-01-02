package com.company;

public class ScientificBook extends Book{
    private int price;
    private String publisher;
    ScientificBook(){}
    ScientificBook(String name, String code, int pages, int price, String publisher){
        super();
        this.price = price;
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookData(){
        return "Publisher: " + publisher + ". Price: " + price;
    }
}
