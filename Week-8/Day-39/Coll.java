import java.util.*;
class Coll
  {
    public static void main(String args[])
    {
      ArrayList ob=new ArrayList();
      ob.add(1);
      ob.add(2);
      ob.add("r");
      ob.add("vikas");
      ob.add(13);
      ob.add(13);
      System.out.println(ob);
       System.out.println(ob.size());
      ArrayList ob1=new ArrayList();
      ob1.add(2);
      ob1.add("vikas");
      ob1.add(13);
      System.out.println(ob.removeAll(ob1));
      System.out.println(ob);
      System.out.println(ob1);
       System.out.println(ob1.size());
      Iterator ob2=ob1.iterator();
      while(ob2.hasNext());
     System.out.println(ob2.next()+" ");
       
 }
  }