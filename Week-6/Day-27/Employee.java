class Employee
  {
    String name;
    int id;
    int salary;
    static String college_name; 
  
public  void emp()
  {
  System.out.println("Name is :"+name);
    System.out.println("Id is :"+id);
    System.out.println("salary is :"+salary);
  }

public static void main(String args[])
    {
      Employee e1=new Employee();
      e1.name="vikas";
      e1.id=443;
      e1.salary=35000;
      e1.emp();
      Employee e2=new Employee();
      e2.name="mohan";
      e2.id=442;
      e2.salary=39000;
      e2.emp();
    }
  }