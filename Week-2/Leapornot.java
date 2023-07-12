import java.util.Scanner;
class TakingInput
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide year");
      int year=vikas.nextInt();
      if(year%4==0)
      {
      System.out.println("Is leap year");  
      }
      else if(year%4==0)
      {
      System.out.println("Is not a leap year");
      }
      else if (year%4!=0) && (year%10===0)
      {
      System.out.println(Is not a leap year");
        }
      else if (year!4==0) && (year!100==0)
      {
      System.out.println(Is not a leap year");
        }
      
    }
      
        
  }