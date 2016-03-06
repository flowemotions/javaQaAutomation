package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandPa1 = new Human("дед Иван", true, 55, null, null);
        Human grandPa2 = new Human("дед Олег", true, 57, null, null);
        Human grandMa1 = new Human("бабушка Люда", false, 50, null, null);
        Human grandMa2 = new Human("бабушка Света", false, 52, null, null);
        Human father = new Human("отец Михаил", true, 32, grandPa2, grandMa2);
        Human mother = new Human("мать Анна", false, 30, grandPa1, grandMa1);
        Human child1 = new Human("сын Андрей", true, 12, father, mother);
        Human child2 = new Human("дочь Лиза", true, 10, father, mother);
        Human child3 = new Human("сын Денис", true, 8, father, mother);

        System.out.println(grandPa1);
        System.out.println(grandPa2);
        System.out.println(grandMa1);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
