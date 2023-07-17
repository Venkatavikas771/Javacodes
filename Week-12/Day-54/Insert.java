import java.util.Scanner;
class Insert
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
      System.out.println("Enter the element to insert");
      int b=sc.nextInt();
      System.out.println("Enter the index to insert given value");
      int in=sc.nextInt();
      int b[]=new int[size+1]
       for(int i=0;i<a.length;i++)
         {
           if(i==in)
           {
             b[i]=b;
           }
             else if(i>in)
             {
               b[i]=a[i-1];  
             }
           else
           {
             b[i]=a[i];
           }
         }
      
      for(int i=0;i<b.length;i++)
        {
          System.out.println("The array elements are :"+a[i]);
        }
    }
  }