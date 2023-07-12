import java.util.Comparator;
import java.util.TreeSet;

class Treeset
  {
    public static void main(String args[])
    {
      TreeSet t=new TreeSet(new MyComparator()); //Custom ordering
      t.add("dhaba");
       t.add("Dad");
       t.add("e");
       t.add("Faf");
       t.add("G");
       t.add("A");
      
      System.out.println(t);
 }
  }
    class MyComparator implements Comparator{
  public int compare(Object obj1,Object obj2){
    String S1=(String)obj1;
    String S2=(String)obj2;
    return -S1.compareTo(S2);
      
    
  }
    }