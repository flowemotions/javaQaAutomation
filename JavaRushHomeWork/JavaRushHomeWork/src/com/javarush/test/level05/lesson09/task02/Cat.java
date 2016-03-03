package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    private String name = null;
    private int age = 0;
    private int weight = 0;
    private String color = null;
    private String address = null;

    public static void main(String[] args)
    {
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Брасик", 2, 5);
        Cat cat2 = new Cat("Барсик", 5, 0);
        Cat cat3 = new Cat(10, "Черный", null, null, 0);
        Cat cat4 = new Cat(3, "Серый", null);
    }

    public Cat (String name){
        this.name = name;
    }

    public Cat (String name, int age){
        this.age = age;
        this.name = name;
    }
    public Cat (String name, int age, int weight){
        this.age = age;
        this.name = name;
        if (weight == 0) {
            this.weight = 2;
        } else {
            this.weight = weight;
        }
    }

    public Cat (int weight, String color, String name, String address, int age){
        this.weight = weight;
        this.color = color;
        this.name = name;
        this.address = address;
        if (age == 0) {
            this.age = 2;
        } else {
            this.age = age;
        }
    }

    public Cat (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
