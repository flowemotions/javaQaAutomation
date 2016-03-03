package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle {

    private int centerX = 0;
    private int centerY = 0;
    private int radius = 0;
    private int width = 0;
    private String color = null;

    public static void main(String[] args){
        Circle circle = new Circle(1, 1, 5);
        Circle circle1 = new Circle(1, 1, 5, 1);
        Circle circle2 = new Circle(1, 1, 5, 1, null);
    }

    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
