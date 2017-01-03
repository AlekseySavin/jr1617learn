package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статичесsкие коты
1. В классе Cat добавь public статическую переменную cats (ArrayLit<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
        cats.add(this);
    }
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>(); //1

    public static void main(String[] args) {
        //Создай тут 10 котов
        for (int i = 1; i <= 10; i++) {
            Cat cat = new Cat(); //2
        }
        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        System.out.println(cats); //3
    }
}
