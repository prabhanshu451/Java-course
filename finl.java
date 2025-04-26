// it can be used variable , method ,class name
// it can be used in any place

// final class A 
// {
//     public void show()
//     {
//         System.out.println("A show method");
//     }
//     public void add(int a , int b)
//     {
//         System.out.println("A add method");
//     }
// }
// by making the class final we cannot inherit it
// we are stopping inheritance


// class B extends A // error : final class cannot be inherited
// {
//     public void show()
//     {
//         System.out.println("B show method");
//     }
//     public void add(int a , int b)
//     {
//         System.out.println("B add method");
//     }
// }



// final method
class A 
{
    public final void show()
    {
        System.out.println("A show method");
    }
    public void add(int a , int b)
    {
        System.out.println("A add method");
    }
}
// by making the method final we cannot override it
// we are stopping overriding
class B extends A 
{
    // public void show() // error : final method cannot be overridden
    // {
    //     System.out.println("B show method");
    // }
    public void add(int a , int b)
    {
        System.out.println("B add method");
    }
}



// final variable

public class finl {
    public static void main(String [] args)
    { 

    }
    // final is used to declare a constant variable
    // it simply means to make constant of variable
    // if any variable is associated with final keyword then its value cannot be changed
// {
//     int a = 10;
//     a = 20;
//     System.out.println(a); // 20
// }
// when we use final with it then it cannot be changed
    // {
    //     final int a = 10;
    //     // a = 20; // error: cannot assign a value to final variable a
    //     System.out.println(a); // 10

    // }
    
}
