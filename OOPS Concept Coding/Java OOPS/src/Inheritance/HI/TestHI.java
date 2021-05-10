package Inheritance.HI;


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

// derived Cat class
class Cat extends Animal
{

    void meow()
    {
        System.out.println("Meowing...");
    }

}

// derived Cow class
class Cow extends Animal
{

    void moo()
    {
        System.out.println("Mooing...");
    }

}
// driver class
public class TestHI
{
    public static void main(String[] args)
    {

        Dog tuffy = new Dog();
        Cat anna = new Cat();
        Cow molly = new Cow();
        tuffy.bark();
        tuffy.eat();
        anna.meow();
        anna.eat();
        molly.moo();
        molly.eat();

    }
}
/*
--------------------------
3)Hierarchical Inheritance
--------------------------
In hierarchical inheritance, multiple classes can inherit from the same parent class itself.
It is useful when multiple classes have to inherit all the properties and behavior from the same parent class.

 */
