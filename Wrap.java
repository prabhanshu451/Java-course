// public class Wrap {
//     public static void main(String[] args) {
//         int a = 10; // primitive data type
//         Integer b = new Integer(a); // wrapper class
//         Integer c = a; // auto-boxing (primitive to wrapper class) 
//         int d = b.intValue(); // unboxing (wrapper class to primitive)
//         int e = b; // auto-unboxing (wrapper class to primitive)
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(d);
//         System.out.println(e);
    

// // wrapper class is a class that wraps a primitive data type into an object.
// // wrapper classes are used to convert primitive data types into objects.
// // wrapper classes are used to convert objects into primitive data types.
// // wrapper classes are used to convert between different primitive data types.

// String str = "1234"; // string object\
// int num = Integer.parseInt(str); // string to int
// System.out.println(num*2); // 1234

// String str2 = String.valueOf(num); // int to string
// System.out.println(str2); // 1234
//     }}

class a {
    public void pM(int me){
        System.out.println("I am a parent class method " + me);
    }
    public void pM(Integer me){
        System.out.println("I class method " + me);
    }
}
public class Wrap {
    public static void main(String[] args)
    {
        a obj = new a();
        obj.pM(5); 
    }
}