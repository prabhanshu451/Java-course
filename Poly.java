class A 
{
    public void display() 
    {
        System.out.println("Class A");
    }

}
class B extends A 
{
    public void display() 
    {
        System.out.println("Class B");
    }
}
class C extends A 
{
    public void display() 
    {
        System.out.println("Class C");
    }
}
public class Poly 
{
    public static void main(String[] args) 
    {
        A a = new A();
        a.display(); // This will call the display method from class A 
       
        B b = new B();
        b.display(); // This will call the display method from class A
        
        // we can also create a object of B and type as A
        A k = new B();
        k.display(); // This will also call the display method from class A

        a = new B(); // This will call the display method from class A
        a.display();

        a = new C(); // This will call the display method from class A
        a.display(); // This will also call the display method from class A
}
}

// Dynamic method dispatch 
// In Java, dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime rather than compile-time.
// This allows Java to support runtime polymorphism, where the method that gets executed is determined by the actual object type at runtime, not the reference type.
// This is achieved through method overriding and inheritance.
// When a subclass overrides a method of its superclass, the method that gets executed is determined by the actual object type, not the reference type.
// This means that if a subclass has its own implementation of a method, that implementation will be called even if the reference type is the superclass.
// This is known as dynamic method dispatch or runtime polymorphism.