//write a java program that reads temperatures of a week and find the average temperature of the week and maximum temperature and minimum temperature of the week
import java.util.Scanner;
class MockInterview
  {
    public static void main(String args[])
    {
    Scanner tempe=new Scanner(System.in);
      System.out.println("Enter the temperatures through out the week");
      float a[]=new float[7];
      for(int i=0;i<a.length;i++)
        
        {
          a[i]=tempe.nextFloat();
        }
      
      float sum=0;
      float max=a[0];
      float min=a[0];
      for(int i=0;i<a.length;i++)
        {
         sum=sum+a[i] ;
          if(max<a[i])
          {
            max=a[i];
          }
          if(min>a[i])
          {
            min=a[i];
          }
        }
      System.out.println("The max temp is :"+max);
      System.out.println("The min temp is :"+min);
     System.out.println("The average is :"+(sum)/7);

     
    }
  }