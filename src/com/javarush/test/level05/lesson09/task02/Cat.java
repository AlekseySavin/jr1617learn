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

public class Cat
{
    //напишите тут ваш код
    private  String name = "noname";
    private  int weiht = 99;
    private  int age = 0;
    private  String color = "nocolor";
    private  String adress = "noadress";

    public Cat (String name) {
        this.name = name;
    }

    public Cat (String name, int weiht, int age) {
        this.name = name;
        this.weiht = weiht;
        this.age = age;
    }

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        this.weiht = weiht;
    }

    public Cat (int weiht, String color) {
        this.name = name;
        this.color = color;
        this.adress = adress;
        this.age = age;
    }

    public Cat (int weiht, String color, String adress) {
        this.weiht = weiht;
        this.color = color;
        this.adress = adress;
    }

}
