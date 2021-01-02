package com.company;

public class ERPSystem {
    User []memory = new User[1000]; //максимум 1000 пользователей
    int sizeOfUsers = 0;

    void addUser(User u) // метод добавляет пользователя
    {
        if(sizeOfUsers < memory.length){
            memory[sizeOfUsers] = u;
            sizeOfUsers++;
        }
    }
    void printAllUsers() //    метод выводит на экран всех пользователей
    {
        for(int i = 0; i < memory.length; i++){
            System.out.println(memory[i]);
        }
    }
    void printUser(int index) // метод выводит на экран одного пользователя, но если пользователь по данному индексу не существует, то выводит сообщение: "No user in this index"
    {
        if(memory[index] != null)
            memory[index].getUserData();
        else System.out.println("No user in this index");
    }
}
