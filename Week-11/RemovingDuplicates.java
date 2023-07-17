import java.util.*; 
import java.util.ArrayList; 

class Duplicate  { 
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      ArrayList<Integer> ar=new ArrayList<Integer>();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
      LinkedHashSet<Integer> lh=new  LinkedHashSet<Integer>(ar);
      Iterator l=lh.iterator();
      while(l.hasNext())
        {
           System.out.println("-------");
          System.out.println(l.next());
        }
        
    }
  }

