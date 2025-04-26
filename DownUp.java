class A 
{
    public void show1()
    {
        System.out.println("A's show() method");
    }
}
class B extends A 
{
    public void show2()
    {
        System.out.println("B's show() method");
    }
}
public class DownUp {
    public static void main (String[] args)
    {
        A obj = new A();
        obj.show1();
        
        A obj1 = (A)new B(); // Upcasting
        // upcasting means converting a subclass reference to a superclass reference
        // here, we are converting B class reference to A class reference
        // and this is done implicitly by the compiler
        // but we can also do it explicitly by writing (A) before new B()

        // typecast it to A to call show1()
        // but writing (A) is not necessary
        // because obj1 is already of type A
        // and it is a reference of B class object
        obj1.show1();

        B obj2 = (B)obj1; // Downcasting
        // Downcasting means converting a superclass reference to a subclass reference
        obj2.show2();
    
}
}
