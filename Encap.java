class Human
{
    private int age ;
    private String name;


// Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
// It is a protective barrier that keeps the data safe within the object and prevents outside code from directly accessing it
// Encapsulation is one of the four fundamental Object Oriented Programming (OOP) concepts. The other three are inheritance, polymorphism, and abstraction.
// Encapsulation is achieved by declaring class variables as private and providing public getter and setter methods to access and update the value of private variables
// The getter method returns the variable value, and the setter method sets the value of the variable
// The getter and setter methods are public, so they can be accessed from outside the class, but the variables are private, so they cannot be accessed directly from outside the class
// Encapsulation helps to protect the integrity of the data by preventing outside code from directly accessing and modifying it
// It also helps to hide the implementation details of the class, so that the user of the class does not need to know how the class works internally
// Encapsulation also helps to achieve data abstraction, which is the process of hiding the implementation details and showing only the essential features of the object
// Encapsulation is a key concept in Object Oriented Programming (OOP) and is used to achieve data abstraction and data hiding
public void setAge(int a)
{
    age = a;
}
public int getAge()
{
    return age;
}
public void setName(String n)
{
    name = n;
}
public String getName()
{
    return name;
}
}

public class Encap
{
    public static void main(String[] args)
    {
        Human hm = new Human();
        hm.getAge( );
        hm.setAge(55);
        hm.setName("jesus singh");
        hm.getName();
        System.out.println(hm.getName() + ":" + hm.getAge());

    }
}
