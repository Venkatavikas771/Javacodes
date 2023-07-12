
import java.util.Scanner;
class Adittion
{
  public static void   evenNumbers(int a,int b)
    {
       for(int i=a;i<=b;i++)
        {
          if(i%2==0)
          {
            System.out.println("Then even nuber between range"+a + "and"  +b+ "are :" +(i) );
          }
        }  
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the first number");
       int a=even.nextInt();
      System.out.println("Enter the last number");
       int b=even.nextInt();
      evenNumbers(a,b);
     }
  }