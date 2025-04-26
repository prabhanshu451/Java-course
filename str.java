public class str 
{
    public static void main(String[] args)
    {
        // String name = "ram"; // creating a string with value "ram"
        // String nam = new String(); // creating an empty string
        // String nam1 = new String("ram"); // creating a string with value "ram"
        // System.out.println(nam); // prints empty string
        // System.out.println(nam1); // prints "ram"   
        // System.out.println(name); // prints "ram"
        // System.out.println(name.length()); // prints length of string "ram" which is 3
        // System.out.println(name.charAt(0)); // prints first character of string "ram" which is 'r'
        // System.out.println(name.charAt(1)); // prints second character of string "ram" which is 'a'         
        // System.out.println(name.charAt(2)); // prints third character of string "ram" which is 'm'
        // System.out.println("hello " + name);  
        // System.out.println(name.concat(" sharma"));  


        // STRING BUFFER
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        StringBuffer sb1 = new StringBuffer("Jesus singh");
        System.out.println(sb1.capacity());
        System.out.println(" length " +  sb1.length());   
        sb1.append(" yasu");
        System.out.println(sb1);
        String st = sb1.toString();
        System.out.println(st);
        sb1.insert(0, "hello ");
        System.out.println(sb1);
        sb1.deleteCharAt(2);
        System.out.println(sb1);
        sb1.delete(0, 5);
        System.out.println(sb1);
        sb1.setLength(50);
        System.out.println(sb1);
         String s = sb1.substring(5, 9);
        System.out.println("substring " + s);
        sb1.reverse();  
        System.out.println("reverse " + sb1);
        sb1.replace(0, 5, " hello "); // replace first 5 characters with "hello"
        System.out.println("replace " + sb1);
    }

   
}
