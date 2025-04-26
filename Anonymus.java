class A
{
    // constructor of class A
    // constructor is always called when we create an object of class A
    public A()
    {
        System.out.println("object is created");
    }
    public void show()
    {
        System.out.println("in a show");
    }
}
public class Anonymus {
    public static void main(String[] args)
    {
        // A obj = new A(); this is  a two steps not one lhs is different step and rhs is diffent step.
        // A obj = new A(); // is this line is important to create a object 
        // lets use the constructor of A class to create an object of A class
        // obj.show();
       
        

        // like for a variable we first declare it and then assign the value
        // so like this we can create an object of class A
        // A obj;
        // obj = new A();
        // // this new A() is where we create the object
        // obj.show();
        // this is a two steps process first we create an object of class A and then we assign it to obj
    
        new A(); 
        // this is called anonymous object creation
        // this type of object does not have a name 
        // this is object creation and we are not assigning it to any variable
        // so we can not reuse it again
        // every time we write new A() it will create a new object of class A
        // now we have created two objects 
        new A().show();

        // we can use the object creation and show method in a single line
        //  
    
    





    }
}
