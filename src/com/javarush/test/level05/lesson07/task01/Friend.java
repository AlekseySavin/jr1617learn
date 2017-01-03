package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String Name;
    private int Age;
    private char Sex;

    public void initialize(String Name){
        this.Name = Name;
    }

    public void initialize(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }

    public void initialize(String Name, int Age, char Sex) {
        this.Name = Name;
        this.Age = Age;
        this.Sex = Sex;
    }
}
