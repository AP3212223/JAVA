package Inheritance.MLI;
//Java program to illustrate the
// concept of Multilevel inheritance

// base class
class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}

// derived Dog class
class Dog extends Animal
{

    void bark()
    {
        System.out.println("Barking...");
    }

}

// derived BabyDog class
class BabyDog extends Dog
{

    void weep()
    {
        System.out.println("Weeping...");
    }

}
// driver class
public class TestMultilevelInheritance
{
    public static void main(String[] args)
    {

        BabyDog tuffy = new BabyDog();
        tuffy.weep();
        tuffy.bark();
        tuffy.eat();

    }
}
/*
------------------------
2)Multileval Inheritance
-------------------------
In multilevel inheritance, we can inherit from the child class itself.
It is useful when we have to inherit all the properties and behavior of the parent class and the grandparent class.
 */