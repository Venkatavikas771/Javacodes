import java.util.Scanner;
class GetterSetter
  {
    String name;
    int id;
    float salary;
public void setName(String name)
    {
      this.name=name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public void setSalary(float salary)
    {
      this.salary=salary;
    }
    public  String getName()
    {
      return name;
    }
    public int getId()
    {
      return id;
    }
    public float getSalary()
    {
     return salary;
    }
  }

    class Getter
      {
        public static void main(String[] args)
        {
          Scanner sc=new Scanner(System.in);
          GetterSetter emp[]=new GetterSetter[3];
          
          emp[0]=new GetterSetter("pavan",443,4500);
            emp[1]=new GetterSetter("kumar",442,75000);
                 for(int i=0;i<3;i++)
                 {
          System.out.println("Name is :"+emp[i].getName());
           System.out.println("Id is :"+emp[i].getId());
           System.out.println("Salary is :"+emp[i].getSalary());
                 }
        }
      }




    
  