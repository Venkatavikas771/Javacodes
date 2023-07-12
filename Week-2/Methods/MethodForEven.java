import java.util.Scanner;
class MethodForEven
{
  public static void even(int first,int last)
    {
     for(int i=first;i<=last;i++)
       {
         if(i%2==0)
         {
           System.out.println("EVEN NUMBERS ARE :"+i);
         }
         
       }
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the first number");
      int first=vikas.nextInt();
      System.out.println("Enter the last number");
      int last=vikas.nextInt();
      even(first,last);
     }
  }
