import java.util.*;
class Student
  {
    String name;
    int marks;

    Student(String name,int marks)
    {
      this.name=name;
      this.marks=marks;
    }
public  String getname()
    {
      return name;
    }
public  int getmarks()
    {
      return marks;
    }

    public String toString()
    {
      return "["+"name:" +name +"marks:"+marks+"]";
    }
  }

    class Mycomparator implements Comparator
      {
        public int compare(Student s1,Student s2)
    {        
      if(s1.this.marks<s2.getmarks())
      return 1;
    else if(s1.getmarks()>s2.getmarks())
      return -1;
    else
      return 0;
    }
      }
    class Treemap
      {
        public static void main(String args[])
        {
        TreeMap t=new TreeMap(new Mycomparator());
           t.put(new Student("vikas",100),"A");
           t.put(new Student("jagadeesh",45),"B");
           t.put(new Student("FAF",10),"C");
          System.out.println(t);
        }
      }
  