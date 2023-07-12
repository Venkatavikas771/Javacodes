import java.util.*;

class Cust1 implements Comparable <Cust1>
  {
    String name;
    int id;
    Cust1(String name,int id)
    {
      this.name=name;
      this.id=id;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public int compareTo(Cust1 m) 
    {
      int val=getName().compareTo(m.getName());
      return val;
    }
  }
/*class  Mycomparator implements Comparator<Cust1>
  {
    public int compare(Cust1 a,Cust1 b)
    {
      int val=a.getId().compare(b.getId());
      return -val;
    }
  }*/
class Cust
  {
    public static void main(String args[])
    {
      Cust1 c1= new Cust1("vikas",2);
       Cust1 c2= new Cust1("hello",3);
       Cust1 c3= new Cust1("Abc",4);
       Cust1 c4= new Cust1("Xyz",5);
      TreeSet s=new TreeSet();
      s.add(c1);
      s.add(c2);
      s.add(c3);
      s.add(c4);

      for(Object o:s)
        {
          System.out.println(o);
        }
     
      
    }
  }