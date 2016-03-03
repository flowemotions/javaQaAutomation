package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend{
    private String name;
    private int age;
    private String gender;

    public Friend(String name){
    this.name = name;
    }

    public Friend(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args)
    {
        Friend friend = new Friend("Friend");
        Friend friend1 = new Friend("Friend", 12);
        Friend friend2 = new Friend("Friend", 12, "Male");

    }


}