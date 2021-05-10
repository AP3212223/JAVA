package Inheritance.SLI;

//Java program to illustrate the
// concept of single inheritance

// base class
class Animal
{
    void eat()
    {
        System.out.println("Eating...");
    }
}

// derived class
class Dog extends Animal
{

    void bark()
    {
        System.out.println("Barking...");
    }

}

// driver class
public class TestSingleLevelInheritance
{
    public static void main(String[] args)
    {

        Dog tuffy = new Dog();
        tuffy.bark();
        tuffy.eat();

    }
}
/*
----------------------------
IMPORTANT POINT TO REMEMBER.
----------------------------
Inheritance is an important pillar of OOP(Object Oriented Programming).
It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.

----------------------
Important terminology:
----------------------
Super Class: The class whose features are inherited is known as the superclass(or a base class or a parent class).

Sub Class: The class that inherits the other class is known as the subclass(or a derived class, extended class, or child class).
           The subclass can add its own fields and methods in addition to the superclass fields and methods.

Reusability: Inheritance supports the concept of "reusability",
             i.e. when we want to create a new class and there is already a class which includes some of the code that we want, we can derive our new class from the existing class.
             By doing so, we can reuse the fields and methods of the existing class.

------------------------------
How to use inheritance in Java
------------------------------

The keyword used for inheritance is extends.
Syntax :

class derived-class extends base-class
{
   //methods and fields
}
-------------------------
Types of Inheritance
-------------------------
1)Single Inheritance-->>In single inheritance, there is only one parent and child class, and the child class inherits all the properties and behavior from the parent class.
2)Multilevel Inheritance
3)Hierarchical Inheritance
4)Multiple Inheritance

-------
NOTE(Why Java doesn't support Multiple Inheritance?)
-------
Multiple Inheritance is a feature of an object-oriented concept, where a class can inherit properties of more than one parent class.
The problem occurs when there exist methods with the same signature in both the superclasses and subclasses.
On calling the method, the compiler cannot determine which class method to be called and even on calling, which class method gets the priority.

Consider the below Java code. It shows an error.


// First Parent class
class Parent1
{
    void fun()
    {
        System.out.println("Parent1");
    }
}

// Second Parent Class
class Parent2
{
    void fun()
    {
        System.out.println("Parent2");
    }
}

// Error : Test is inheriting from multiple
// classes
class Test extends Parent1, Parent2
{
   public static void main(String args[])
   {
       Test t = new Test();
       t.fun();
   }
}

Output :
Compiler Error

From the code, we can see that upon calling the method fun() using the Test object will cause complications such as whether to call Parent1’s fun() or Parent2’s fun() method.

Thus problems of Multiple Inheritance
------------------
1)Diomond Problem
------------------

// A GrandParent class in diamond
class GrandParent
{
    void fun()
    {
        System.out.println("Grandparent");
    }
}

// First Parent class
class Parent1 extends GrandParent
{
    void fun()
    {
        System.out.println("Parent1");
    }
}

// Second Parent Class
class Parent2 extends GrandParent
{
    void fun()
    {
        System.out.println("Parent2");
    }
}


// Error : Test is inheriting from multiple
// classes
class Test extends Parent1, Parent2
{
   public static void main(String args[])
   {
       Test t = new Test();
       t.fun();
   }
}

From the code, we can see that: On calling the method fun() using the Test object causes complications such as whether to call Parent1’s fun() or Child’s fun() method.
Therefore, in order to avoid such complications, Java does not support multiple inheritances of classes.

-------------
2)Simplicity
-------------
Multiple inheritances are not supported by Java using classes, handling the complexity that causes due to multiple inheritances is very complex.
It creates problems during various operations such as casting,
constructor chaining, etc and there are very few scenarios in which we actually need multiple inheritances,
so better to omit it for keeping things simple and straightforward.

 */
