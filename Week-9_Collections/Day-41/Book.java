/import java.util.*;
class Books implements Comparable
  {
    String name;
    String author;
    double price;
  Books(String name,String author,double price)
    {
    this.name=name;
    this.author=author;
      this.price=price;
    }
public int compareTo(Object obj)
    {
      Books bo=(Books)obj;        //int val=this.namecompareTo(obj.name) for name default sorting=for aihabetic sorting
     if(obj.getPrice()>bo.price)
      return 1;
    else if(this.price<bo.price)
      return -1; 
    else
      return 0;
    }
    public String toString()
    {
      return "["+"name:"+name +"author:"+author+"price:"+price+"]";
    }
    
  }
class Book
  {
    public static void main(String[] args)
    {
      Books b1=new Books("social","muttai",678);
       Books b2=new Books("Hindi","nannai",34);
       Books b3=new Books("TELUGU","HANNAI",12);

       TreeSet obj=new TreeSet();
      obj.add(b1);
       obj.add(b2); 
       obj.add(b3);

      for(Object o:obj)
        {
          System.out.println(o);
        }
    }
  }*/

/* USING FOR EACH LOOP
Importing util package
import java.util.*;
 
// Custome class Car implements Comparable interface
class Car implements Comparable<Car> {
 
    // attributes
    private int Modelno;
    private String name, city;
    private int stock;
 
    // Car constructor
    public Car(int Modelno, String name, String city,
            int stock)
    {
        this.Modelno = Modelno;
        this.name = name;
        this.city = city;
        this.stock = stock;
    }
 
    public int getModelno() {
        return Modelno;
    }
 
    public void setModelno(int modelno) {
        Modelno = modelno;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public int getStock() {
        return stock;
    }
 
    public void setStock(int stock) {
        this.stock = stock;
    }
 
    // Override the compareTo() method
    public int compareTo(Car c)
    {
        return name.compareTo(c.name);
    }
}
 
public class Test4{
    // Main driver method
    public static void main(String[] args)
    {
 
        // Define an objects of TreeSet class
        TreeSet<Car> set = new TreeSet<Car>();
        
        // Creating Car objects
        Car c1 = new Car(132, "BMW", "Rajkot", 35);
        Car c2 = new Car(269, "Audi", "Surat", 20);
        Car c3 = new Car(560, "Kia", "Vadodara", 15);
        Car c4 = new Car(109, "Creta", "Ahmedabad", 26);
 
        // Adding Car objects to TreeSet
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
 
        // Traversing TreeSet
        for (Car c : set) {
            System.out.println(c.getName() + " " + c.getStock() + " "
                            + c.getCity() + " " + c.getModelno());
        }
    
    //System.out.println(set);
    }
}
 */