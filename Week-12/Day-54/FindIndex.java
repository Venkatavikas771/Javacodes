//Write a Java program to find the index of an array element.
import java.util.Scanner;
class FindIndex
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    int a[]={1,2,3,4,5};
      System.out.println("Enter the index to find the element");
        int in=sc.nextInt(); //2
      for(int i=0;i<a.length;i++)   //0<5, 1<5  ,2
        {
          if(i==in)      // 0==2  //1==2  //2==2
          {
            System.out.println("The index element of given index is :"+a[i]);
              break;
          }
          else
          {
           System.out.println("No element found at that index");
            break;
          }
          
        }
       
    }
  }