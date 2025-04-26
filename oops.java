class calc
{
    int num = 10; // instance variable
    // static int num2 = 20; // static variable        
    public int add(int n1 , int n2)  
//  n1 and n2 are local variables
    //  n1 and n2 are parameters of the method add
    // every method has its own stack,here there are two stacks, one for main and one for add
    //  when the method is called, a new stack is created for that method
    {
        System.out.println(num); // instance variable num is accessed here
        return n1+n2;
    }
}
public class oops
{
    public static void main(String[] args)
    {
        int data = 12; // local variable
        calc c = new calc(); 
        // c is a reference variable of type calc, it is used to access the instance variables and methods of the class calc
        calc c1  =new calc(); // c1 is another reference variable of type calc, it is used to access the instance variables and methods of the class calc
        // c and c1 are two different objects of the class calc, they have their own instance variables

        int res = c.add(5,4); // calling the method add of the object c, passing 5 and 4 as arguments
        System.out.println(res);
        System.out.println(data); // accessing the instance variable num of object c

        c.num = 100; // changing the value of instance variable num of object c
        System.out.println(c1.num); 
        System.out.println(c.num); 
    }
}