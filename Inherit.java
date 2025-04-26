// inheritance is a process where one class acquires the properties of another class.
// The class which inherits the properties of another class is called the child class or subclass.  
// The class whose properties are inherited is called the parent class or superclass.
// The child class can add its own fields and methods in addition to the superclass fields and methods.
// The child class can also override the methods of the parent class.
// Inheritance is a way to achieve reusability in Java.
// Inheritance is a mechanism in which one class acquires the properties of another class.
class Calc
{
    public int add(int n1 , int n2)
    {
        return n1+n2;

    }
    public int sub(int n1 , int n2)
    {
        return n1-n2;
    } 
    public int mul(int n1 , int n2)
    {
        return n1*n2;
    }
}
// when we inherit more than 1 class it is called single inheritance
class AdvCalc extends Calc
{
    public int div(int n1 , int n2)
    {
        return n1/n2;
    }
}
// when we inherit more than 2 class it is called multi - level inheritance

class VeryAdvCalc extends AdvCalc
{
    public double power(int n1 ,int n2)
    {
        return Math.pow(n1,n2);
    }
}
public class Inherit 
{
    public static void main(String[] args)
    {
        VeryAdvCalc ac = new VeryAdvCalc();
        System.out.println("Addition: " + ac.add(10, 20));
        System.out.println("Subtraction: " + ac.sub(20, 10));   
        System.out.println("Multiplication: " + ac.mul(10, 20));
        System.out.println("Power: " + ac.power(2, 3));
        System.out.println("Division: " + ac.div(20, 10));
    }
    
}

// multiple inheritance is not supported in java
// because it leads to ambiguity and complexity in the code.
// In Java, a class can only inherit from one superclass.
// multiple inheritance means a class can inherit from more than one class at a time.
// This can lead to ambiguity if two superclasses have methods with the same name.
// For example, if class A and class B both have a method called "display", and class C inherits from both A and B,
// then it is not clear which "display" method class C should inherit.
// This is known as the "diamond problem" in multiple inheritance.
// To avoid this problem, Java does not support multiple inheritance with classes.
// however, Java does support multiple inheritance with interfaces.
// An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures,
//  default methods, static methods, and nested types.
// Interfaces cannot contain instance fields or constructors.
// An interface is a way to achieve abstraction in Java.
// An interface is a collection of abstract methods.
// A class can implement multiple interfaces, which allows for multiple inheritance of method signatures.
// This means that a class can inherit the method signatures from multiple interfaces, but it must provide the implementation for those methods.
// This allows for a class to inherit behavior from multiple sources without the ambiguity of multiple inheritance with classes.        


