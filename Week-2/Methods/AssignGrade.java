
import java.util.Scanner;
class AssignGrade
{
  public static void temperature(float percentage)
  {
  if((percentage >90.00) && (percentage <=100.00))
      {
      System.out.println("A grade");  
      }
      else if((percentage >=81.00) && (percentage <=90.00))
      {
      System.out.print("B grade");
      }
      else if((percentage >=75.00) && (percentage <=80.00))
      {
      System.out.println("c grade");
      }
      else if((percentage >=50.00) && (percentage <75.00))
      {
      System.out.println("d grade");
      }
      else 
      {
      System.out.println("fail");
        
        }
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("enter percentage");
      float percentage =vikas.nextFloat();
     }
  }