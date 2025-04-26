// Java program to demonstrate method overriding
// in inheritance
// Method overriding is a feature that allows a subclass or child class to provide a specific implementation
// of a method that is already defined in its superclass or parent class.
// When a method in a subclass has the same name, return type, and parameters as a method in its superclass,
// the subclass method overrides the superclass method.
// This allows the subclass to provide its own behavior for that method, while still maintaining the same method signature.


// class A{
//     public void display(){
//         System.out.println("Display method of class A");
//     }
// }
// class B extends A{
   
// }
// public class Moverride {
//     public static void main (String[] args)
//     {
//         A obj = new B();
//         obj.display(); 
//     }
// }



// class A{
//     public void display(){
//         System.out.println("Display method of class A");
//     }
// }
// class B extends A{
//     public void display(){
//         System.out.println("Display method of class B");
//     }
   
// }
// public class Moverride {
//     public static void main (String[] args)
//     {
//         A obj = new B();
//         obj.display();  
//     }
// }






// class Calcu
// {
//     public int add(int n1 , int n2)
//     {
//         return n1+n2;
//     }
// }
// class AdCalcu extends Calcu 
// {
//     public int add(int n1 , int n2)
//     {
//         return n1+n2+1;
//     }
// }

// public class Moverride {
//     public static void main (String[] args)
//     {
//         AdCalcu obj = new AdCalcu();
//         int r1  = obj.add(25,65);
//         System.out.println(r1);
//     }
    
// }
