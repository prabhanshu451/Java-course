class Human
{
    int age;
    String name; // Instance variables (attributes) of the Human class
    // The instance variables are private, so they cannot be accessed directly from outside the class
    // public Human()   // Constructor
   
    // {
    //     age =10;    // Initialize age to 10
    //     name = "koundil"; // Initialize name to "koundil"
    // }
    public Human(int age , String name)
    {
        this.age =  age;
        this.name = name; // Constructor with parameters to initialize age and name
    // The this keyword is used to refer to the current object, so that we can distinguish between the instance variables and the parameters with the same name
    }
    public Human(String name) // Constructor with one parameter to initialize name
    {
        this.name = name; // Initialize name to the value passed as a parameter
    }
    public Human(int age) // Constructor with one parameter to initialize age
    {
        this.age = age; // Initialize age to the value passed as a parameter
    }
    public Human(){ // Default constructor
       age = 10;
       name = "koundil";
    // This constructor is called when no arguments are passed to the constructor

    }
    public int getAge()  // Getter method for age
    {
        return age;
    }
    public String getName() // Getter method for name
    {
        return name;
    }
    public void setAge(int age) // Setter method for age
    {
        this.age = age;
    }
    
    public void setName(String name)    // Setter method for name
    {
        this.name = name;
    }
    
}
public class cons 
{
    public static void main(String[] args)
    {
        Human h = new Human();  // Create an object of the Human class
        System.out.println(h.getName() + ":" + h.getAge());
        
        
        Human h1 = new Human(15 , "priyanshi"); // Create an object of the Human class with age 15 and name "priyanshi"
        System.out.println(h1.getName() + ":" + h1.getAge());
        
        
        Human h2 = new Human("koundil"); // Create an object of the Human class with name "koundil" 
        System.out.println(h2.getName());
    }
    
}
