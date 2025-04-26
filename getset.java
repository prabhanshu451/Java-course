class human
{
    private String name;
    private int age;
    // age is a instance variable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        // here a is a local variable
        this.age = a;
        //  this keyword in getter setter  is used for deferentiating between instance variable and local variable
        // here this.age is instance variable and a is local variable 
    }
    
}
public class getset {
    
}
