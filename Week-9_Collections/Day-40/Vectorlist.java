import java.util.*;
class Vectorlist
  {
    public static void main (String args[])
    {
     Vector<String> v=new Vector<String>();
      v.add("vikas");
      v.add("gowri");
      v.addElement("joseph");
      System.out.println(v);
      System.out.println(v.firstElement());
      System.out.println(v.lastElement());
     System.out.println(v.size());
    
      System.out.println(v.contains("vikas"));
      System.out.println(v.remove("gowri"));
       System.out.println(v);
      
    }
  }