package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
    private int weight = 0;
    private int age = 0;
    private String address = null;
    private String color;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialize("Барсик");
        cat.initialize("Васька", 2, 12);
        cat.initialize("Мурзик", 0, 10);
        cat.initialize(5, "Серый", null, null, 0);
        cat.initialize(10, "Черный", "Адрес");
    }

    //Имя,
    public void initialize (String name){
//        if (name == null) {
//            this.name = "Чужой домашний кот";
//        } else {
            this.name = name;
   //     }
    }

    //Имя, вес, возраст
    public void initialize (String name, int weight, int age){
//        if (name == null) {
//            this.name = "Чужой домашний кот";
//        } else {
            this.name = name;
//        }

        if (weight <= 0) {
            this.weight = 2;
        } else {
            this.weight = weight;
        }

        if (age <= 0) {
            this.age = 2;
        } else {
            this.age = age;
        }
    }
    // Имя, возраст (вес стандартный)
    public void initialize (String name, int age){
//        if (name == null) {
//            this.name = "Чужой домашний кот";
//        } else {
            this.name = name;
//        }
        this.weight = 2;
        if (age <= 0) {
            this.age = 2;
        } else {
            this.age = weight;
        }
    }
    //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize (int weight, String color, String name, String address, int age){
        if (weight <= 0) {
            this.weight = 2;
        } else {
            this.weight = weight;
        }
        this.color = color;
        this.name = name;
        this.address = address;
        if (age <= 0) {
            this.age = 2;
        } else {
            this.age = weight;
        }
    }
    // вес, цвет, адрес ( чужой домашний кот)
    public void initialize (int weight, String color, String address){
        if (weight <= 0)
        {
            this.weight = 2;
        } else
        {
            this.weight = weight;
        }
        this.color = color;

        this.address = name;
    }
}
