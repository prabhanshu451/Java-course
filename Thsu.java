// class A 
// {
//     public A()
//     {
//         System.out.println("in a ");
//     }
// }
// class B extends A 
// {
//     public B()
//     {
//     System.out.println("in b");
//     }
// }
// public class Thsu 
// {
//     public static void main(String[] args)
//     {
//         B igi = new B();
//     }
// }


// here we are using This and Super methods

// class a
// {
    // every constructor in java has a super() method by default
    // if we do not use super() in the constructor, it will be called by default
    // and if we use super() in the constructor, it will be called first
    // and then the constructor will be called
    // super() means calling the constructor of the parent class/super class
    // this() means calling the constructor of the same class
    // this() must be the first statement in the constructor
    // super() must be the first statement in the constructor
    // super () is by default but when we have to pass the parameterized constructor 
    // then we have to use the super().
    // super() ko hum child class ke constructor mai use krte hai jisae ki parent class kae constructor 
    // ko call kare




    // even if we dont mention every class in java extends object class by default
   
    // public a extend Object{}

    // not necessary to mention extends object class in the class


    // so we can use super() to call the constructor of the object class in the parent class

//     public a()
//     {
//         super();
//         System.out.println("constructor in a");
//     }
//     public a(int n)
//     {
//         super();
//         System.out.println("in a int");
//     }
// }
// class b extends a
// {
//     public b()
//     {
//         super(5);
//         System.out.println("Constructor in b");
//     }
//     public b(int n)
//     {
//         super(n);
//         System.out.println("in b int");
//     }
// }



// public class Thsu 
// {
//     public static void main (String[] args)
//     {
//         b obj = new b();
//     }
// }



// this() method will call the constructor of same class 
// class A 
// {
//     public A()

//     {
//         System.out.println("in a");
//     }
//     public A(int n)
//     {
//         this();
//         System.out.println("in a int");
//     }
// }
// class B extends A
// {
//     public B()
//     {
//         super(5);
//         System.out.println("in b");
//     }
//     public B(int n)

//     {
//         this();
//         System.out.println("in b int");
//     }
// }
// public class Thsu  
// {
//     public static void main (String[] args)
//     {
//         B uv = new B(4);

//     } 
// }

