import java.util.Scanner;
class CalAge
{
  public static void ageCalculation(int a)
    {
       int year=2023-(a);
      
      System.out.println("THE AGE IS :"+year);
      if(year>=18)
      {
      System.out.println("The age is :"+year+":Therefore MAJOR");
      }
      else if(year<18)
      {
      System.out.println("The age is :"+year+":Therefore MINOR");
      }
      else 
      {
      System.out.println("Enter valid age");
      }
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("ENTER BIRTH YEAR");
      int a=vikas.nextInt();
      ageCalculation(a);
     }
  }