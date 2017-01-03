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
    //напишите тут ваш код
    private String Name;
    private int Weight;
    private int Age;
    private String Color;
    private String Address;

    public void initialize (String Name) {
        this.Name = Name;
    }

    public void initialize (String Name, int Weight, int Age) {
        this.Name = Name;
        this.Weight = Weight;
        this.Age = Age;
    }

    public void initialize (String Name, int Weight) {
        this.Name = Name;
        this.Weight = 5;
    }

    public void initialize (String Name, String Color) {
        this.Name = null;
        this.Address = null;
        this.Age = 0;
    }

    public void initialize (String Name, String color, String address) {
        this.Weight = 5;
        this.Color = "Red";
        this.Address = "Moonchen strasse";
    }


}
