// object class is a class that is used to create objects
// it is a class that is used to create objects of other classes


class Laptop extends Object
{
    String brand;
    int price;
    public String toString()
    {
        return "Brand: " + brand + ", Price: " + price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptop other = (Laptop) obj;
    //     if (brand == null) {
    //         if (other.brand != null)
    //             return false;
    //     } else if (!brand.equals(other.brand))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // }
public boolean equals(Laptop obj)
{
    return this.brand.equals(obj.brand) && this.price == obj.price;

}
}
public class ObjClas 
{
    public static void main(String[] args)
    {
        Laptop l = new Laptop();
        l.brand = "Dell";
        l.price = 50000;

        Laptop l1 = new Laptop();
        l1.brand = "HP";
        l1.price = 60000;

        
        boolean b =  l.equals(l1); // it will check the reference of the object
        System.out.println(b);   
        System.out.println(l);
    }
    
}
