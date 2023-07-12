import java.util.Scanner;
class PosOrNeg
{
  public static void checkingPosNeg(int a)
    {
       if(a>0)
      {
      System.out.println("Is positive number");  
      }
      else if(a==0)
      {
      System.out.print("The value you have entered is zero please enter value");
      }
      else
      {
      System.out.println("Is negative number");
        }
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the number");
      int a=vikas.nextInt();
      checkingPosNeg( a);
      
     }
  }