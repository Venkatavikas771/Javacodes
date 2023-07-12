import java.util.*;
class Book
  {
    String name; 
    String author;
    double price;

    
    Book(String name,String author,double price)
    {
      this.name=name;
      this.author=author;
      this.price=price;
    }

public String getname()
    {
      return name;
    }
    public String getauthor()
    {
      return author;
    }
    public double getprice()
    {
      return price;
    }
  }
class Books 
{
  public static void main(String args[])
  {
    ArrayList <Book> ob=new ArrayList<Book>();
    Book b1=new Book("Maths","chand",89);
    Book b2=new Book("social","hari",456);
    Book b3=new Book("science","bhimli",895);

    ob.add(b1);
    ob.add(b2);
    ob.add(b3);

    for(Book obj:ob)
      {
        System.out.println("Book name is :"+obj.getname());
        System.out.println("author name is :"+obj.getauthor());
        System.out.println("Book price is :"+obj.getprice());
      }
}
}