// Java program to demonstrate the use of static variable
// this code is without static variable to demonstrate the difference
// class mobile     
// {  
//     String brand;
//     int price;
//     String name ;
//     public void show()
//     {
//         System.out.println(brand + " : " + price + " : " + name  );

//     }
// }
// public class Stati
// {
//     public static void main(String[] args) 
//     {
//         mobile obj = new mobile();
//         obj.brand = "oneplus";
//         obj.price = 28000;
//         obj.name = "nord";

//         mobile obj1 = new mobile();
//         obj1.brand = "Apple";
//         obj1.price = 500000;
//         obj1.name = "iphone 16";
        
//         obj.name =  "Smartphone";

// obj.show();
// obj1.show();
//     }

// }
// here it will change the name of only obj not obj1




// but if we use static variable then it will change the name of both obj and obj1
// static variable


// 2
// class mobile     
// {  
//     String brand;
//     int price;
//     static String name ;
//     public void show()
//     {
//         System.out.println(brand + " : " + price + " : " + name  );

//     }
// }
// public class Stati
// {
//     public static void main(String[] args) 
//     {
//         mobile obj = new mobile();
//         obj.brand = "oneplus";
//         obj.price = 28000;
//         mobile.name = "nord";

//         mobile obj1 = new mobile();
//         obj1.brand = "Apple";
//         obj1.price = 500000;
//         mobile.name = "iphone 16";
        
//         mobile.name =  "Smartphone";

// obj.show();
// obj1.show();
//     }

// }



// now we will use static method
// static method
// class mobile     
// {  
//     String brand;
//     int price;
//     static String name ;
//     public void show()
//     {
//         System.out.println(brand + " : " + price + " : " + name  );

//     }
//     // create static method
//     public static void show1(mobile obj)
//     {
//         System.out.println("this is static method");
//     // static method can access static variable only not the instance 
//     // variable directly but it can be done in directly by creating object and pass the class name in static method
//     System.out.println(obj.brand + " : " + obj.price + " : " + name);

//     }
// }
// public class Stati
// {
//     public static void main(String[] args) 
//     {
//         mobile obj = new mobile();
//         obj.brand = "oneplus";
//         obj.price = 28000;
//         mobile.name = "nord";

//         mobile obj1 = new mobile();
//         obj1.brand = "Apple";
//         obj1.price = 500000;
//         mobile.name = "iphone 16";
        
//         mobile.name =  "Smartphone";

// obj.show();
// obj1.show();
// // static method can be called by class name or object name
// // but it is recommended to call by class name
// // as it is static method and it is not depend on object
// // so it is better to call by class name
// mobile.show1(obj);
//     }

// }
// static methods are used because they are not depend on object
// and no need to create object of class to call the static method
// static methods are used to create utility methods which are not depend on object



// static block
class mobile
{
    String brand;
    int price ;
    static String name;
    // static block is used to initialize static variable
    // it is called only once when the class is loaded
    static{
        name = "samrtphone";
        System.out.println("static block");
    }
    // create a constructor to initialize instance variable
    public mobile()
    {
        brand = "";
        price = 12233; 
        System.out.println("constructor");
    }
    // we can also initialize sattic varaible in constructor 
    // but it is not recommended to do so 
    // because when we create object of class it will call 
// the constructor and it will initialize the static variable again and again
// so it will be initializeonly once so e use static block
// the static block is only called once irespective of how many object u made
public void show()
{
    System.out.println(brand + ":" + price + " : " + name  );
}
public static void show1(mobile obj1)
{
    System.out.println("this is static method");
    // static method can access static variable only not the instance 
    // variable directly but it can be done in directly by creating object and pass the class name in static method
    System.out.println(obj1.brand + " : " + obj1.price + " : " + name);
}}
public class Stati
{
    public static void main(String[] args) throws ClassNotFoundException
    {

        Class.forName("mobile") ;
        // static block is callled first because it is loaded when class loaded
        // and then constructor is called when object is created
        // so static block is called first and then constructor is called
// these static block and constructoor are only callled  wwhen objects are created
//  so class is also not loaded
// but if you want to load the class then you can use the "forName"
// syntax is Class.forName("class name")
// but it is not recommended to do so because it will load the class and it will call the static block 
        // mobile obj = new mobile();
        // obj.brand = "oneplus";
        // obj.price = 28000;
        // mobile.name = "nord";   

        // mobile obj1 = new mobile();

        // obj.show();
        // obj1.show();

        // mobile.show1(obj1);

        
    
}
}