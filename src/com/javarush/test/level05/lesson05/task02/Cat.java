package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    protected String name;
    protected int age;
    protected int weight;
    protected int strength;
    public static int fightCount = 0;


    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        fightCount++;

        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2; // return score > 2 ? true : false;
    }
}