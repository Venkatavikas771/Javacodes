import java.util.Scanner;
class CalIntByMeth
{
  public static void interest(int amount,int time,int interest)
  {
       double simpleinterest=(amount*time*interest)/100;
    
           System.out.println(simpleinterest);
         }
         
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the first amonut");
      int amount=vikas.nextInt();
      System.out.println("Enter the time in months");
      int time=vikas.nextInt();
      System.out.println("Enter the interest per month");
      int interest=vikas.nextInt();
     interest(amount,time,interest);
     }
  }
