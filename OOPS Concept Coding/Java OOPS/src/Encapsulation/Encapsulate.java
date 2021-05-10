package Encapsulation;

//Java program to demonstrate Encapsulation
public class Encapsulate{
    //private variables declared
    //This can only be accessed by public method of class.
    private String studentName;
    private int studentRoll;
    private int studentAge;

    //get method for name to access private variable studentName.
    public String getName(){
        return studentName;
    }
    //get method for roll to access private variable studentRoll.
    public int getRoll(){
        return studentRoll;
    }
    //get method for age to access private variable studentAge.
    public int getAge(){
        return studentAge;
    }

    //set method for name to set private variable studentName.
    public void setName(String newName){
        studentName=newName;
    }
    //set method for roll to set private variable studentRoll.
    public void setRoll(int newRoll){
        studentRoll=newRoll;
    }
    //set method for age to set private variable studentAge.
    public void setAge(int newAge) {
        studentAge = newAge;
    }
}
