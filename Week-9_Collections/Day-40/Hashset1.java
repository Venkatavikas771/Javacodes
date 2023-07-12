import java.util.*;
class Hashset2
  {
    public static void main (String args[])
    {
    HashSet h=new HashSet();    //same for linked hashset differ in creating constructor
      h.add("vikas");
      h.add("joseph");
      h.add(1);
      System.out.println(h);
      Iterator i=h.iterator();
      while(i.hasNext())
        {
           System.out.println(i.next());
        }
    }
  }