import java.util.*;
class Array
  {
    public static void main(String args[])
    {
      ArrayList<String> ob=new  ArrayList<String>();
        ob.add("vikas");
        ob.add("tahir");
         ob.add("dgradad");
       System.out.println("Elements are");
      for(String rv:ob)
        {
           System.out.println(rv);
        }
       ob.add(0,"pavan");
       ob.add(1,"gowri");
      System.out.println("Elements after adding new elements");
    for(String rv1:ob)
        {
           System.out.println(rv1);
        }
       ob.remove(2);
     System.out.println("Elements after removing first index value");

for(String rv3:ob)
        {
           System.out.println(rv3);
        }
      
     ListIterator li=ob.listIterator();

 System.out.println("Elements after iterating using collection interface");
      
    while(li.hasNext())
      
         System.out.println(li.next()+" ");
      
       System.out.println("Elements after iterating using list interface");
       while(li.hasPrevious())
      
         System.out.println(li.previous()+" ");
      

      
                         }
  }