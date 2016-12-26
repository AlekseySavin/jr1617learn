package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize (int top, int left, int width, int height) {
        this.top = 2;
        this.left = 4;
        this.width = 5;
        this.height = 2;
    }

    public void initialize (int width, int height) {
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int width) {
        this.height = width;
    }

    public void initialize (Rectangle Rectangle) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

}
