package Encapsulation;

public class TestEncapsulation{
    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        // setting values of the variables.
        obj.setName("Abhishek Pal");
        obj.setAge(22);
        obj.setRoll(1819210014);

        // Displaying values of the variables
        System.out.println("Student's name: " + obj.getName());
        System.out.println("Student's age: " + obj.getAge());
        System.out.println("Student's roll: " + obj.getRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " + obj.geekName);
    }
}
/*
IMPORTANT POINTS TO REMEMBER
----------------------------
Encapsulation is defined as the wrapping up of the data under a single unit.
It is the mechanism that binds together the code and the data it manipulates.
Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield.
-->>Technically in encapsulation, the variables or data of a class are hidden from any other class and can be accessed only through any member function of own class in which they are declared.
-->>As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
-->>Encapsulation can be achieved by Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.

Advantages of Encapsulation:
Data Hiding: The user will have no idea about the inner implementation of the class. It will not be visible to the user how the class is storing values in the variables. He only knows that we are passing the values to a setter method and the variables are getting initialized with that value.
Increased Flexibility: We can make the variables of the class as read-only or write-only depending on our requirements. If we wish to make the variables as read-only then we have to omit the setter methods such as setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have to omit the get methods such as getName(), getAge(), etc. from the above program
Reusability: Encapsulation also improves the re-usability and makes the code easy to change with new requirements.
Testing code is easy: Encapsulated code is easy to test for unit testing.



*/