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
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat()
    {
    }

    public boolean fight(Cat anotherCat)
    {
        //напишите тут ваш код
        int Cat1Score = 0;
        int Cat2Score = 0;
        boolean Win;

        //need detailsk
        if (this.weight > anotherCat.weight)
        {
            Cat1Score = Cat1Score + 1;
        } else
        {
            Cat2Score = Cat2Score + 1;
        }
        //need details
        if (this.strength > anotherCat.strength)
        {
            Cat1Score = Cat1Score + 1;
        } else
        {
            Cat2Score = Cat2Score + 1;
        }
        //need details
        //cat1 age grather cat2 age and cat1 age bigger than 5 and not bigger 7 (something like this)

        if ((this.age > anotherCat.age))
        {
            Cat1Score = Cat1Score + 1;
        } else
        {
            Cat2Score = Cat2Score + 1;
        }

        Win = Cat2Score <= Cat1Score;
        return Win;
    }
}
