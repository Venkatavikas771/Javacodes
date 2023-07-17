//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
class AvgOfArray
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array size");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the array elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      double avg;
      int sum=0;
      for(int i=0;i<a.length;i++)
        {
          sum=sum+a[i];
        }
      avg=sum/size;
      System.out.println("The Average of all elements in array are :"+avg);
  }
  }