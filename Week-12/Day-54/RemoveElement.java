//Write a Java program to remove a specific element from an array.

import java.util.Scanner;
class RemoveElement
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
      System.out.println("Enter the index of an  element to remove");
      int in=sc.nextInt();
       for(int i=0;i<a.length;i++)
         {
           if(i==in)
           {
             a[i]=a[i+1];
           }
             else if(i>in)
             {
               a[i]=a[i+1];  
             }
           else
           {
             a[i]=a[i];
           }
         }
      
      for(int i=0;i<a.length;i++)
        {
          System.out.println("The array elements are :"+a[i]);
        }
    }
  }