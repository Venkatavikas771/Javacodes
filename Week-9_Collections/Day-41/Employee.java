import java.util.*;
class Workers 
  {
    double sal;
    String add;
    String name;
    Workers(double sal, String add, String name)
    {
      this.sal=sal;
      this.add=add;
      this.name=name;
    }
  }

    class Mycomparator implements Comparator
      {
    public String compare(Workers A,Workers B) 
        
    {
      
      return (A.add).compareTo(B.add);
        
    }
  }
  
class Employee
  {
    public static void main(String[] args)
    {
      Workers w1=new Workers(5993,"tenali","vikas");
      Workers w2=new Workers(6573,"kolka","aravind");
      Workers w3=new Workers(5993,"Nayudupet","kloesh");
      Workers w4=new Workers(5993,"rangaveedi","sailesh");
      Workers w5=new Workers(5993,"RONGGIPET","Muchal");
      
      TreeSet s=new TreeSet(new Mycomparator());
      s.add(w1);
      s.add(w2);
      s.add(w3);
      s.add(w4);
      s.add(w5);
      for(Object W:s)
        {
          System.out.println(W);
        }
    }
  }