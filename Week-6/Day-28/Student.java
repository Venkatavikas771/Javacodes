class Student
  {
    String name;
    String course;
    Student(String name,String course)
    {
    this.name=name;
      this.course=course;
        
    }
    public void studentails()
    {
      System.out.println("Name is :"+name);
  System.out.println("roll is :"+course);
  
    }
  }
class sd1 extends Student
  {
    String blood1;
    sd1(String name,String course,String blood1)
    {
      super(name,course);
        this.blood1=blood1;
    }
        public void student1details()
    {
          super.studentails();
      System.out.println("blood group is :"+blood1);
  
    }
    }
class sd2 extends Student
  {
    String blood2;
    sd2(String name,String course,String blood2)
    {
      super(name,course);
        this.blood2=blood2;
    }
        public void student2details()
    {
          super.studentails();
      System.out.println("blood group is :"+blood2);
      
        }
  
    }
    class Studentdetails
    {
       public static void main(String[] args)
    {

      sd1 ob=new sd1("vikas","ece","a+");

     ob.student1details();

     sd2 ob1=new sd2("rakesh","cse","a");

      ob1.student2details();
      

      
  }
    }

    
    
  
