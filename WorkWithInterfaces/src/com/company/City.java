package com.company;

public class City{
    private Restaurant[] allRestaurants = new Restaurant[50];
    private int restaurantSize = 0;
    private String cityName; // геттер и сеттер для данного поля
    public City(String cityName) // Конструктор
    {this.cityName = cityName;}
    public City(){} // Конструктор по умолчанию

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void addRestaurant(Restaurant restaurant) // Данный метод добавляет ресторан в список
    {
        if(restaurantSize < allRestaurants.length){
            allRestaurants[restaurantSize] = restaurant;
            restaurantSize++;
        }
    }

    public double getTotalTax() //Данный метод возвращает общую сумму разницы дохода и расхода всех ресторанов умноженную на 15 % как налог.
    {
        double sum = 0.00;
        for(int i = 0; i < restaurantSize; i++){
            sum += allRestaurants[i].getTotalIncome() - allRestaurants[i].getTotalOutcome();
        }
        return sum * 0.15;
    }


}
