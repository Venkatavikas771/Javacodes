import java.util.Scanner;
class MaxEle
  {
    public static void maxEle(int a[],int size)
    {
      
      int i;
      int temp;
      for( i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              if(a[j]<a[i])
              {
                temp=a[j];
                  a[j]=a[i];
                a[i]=temp;
                System.out.println("ddd"+a[i]);
              }
            }
         
        }
  
    }
    public static void main(String args[])
    {
      Scanner mx=new Scanner(System.in);
       System.out.println("Enter the array size");
      int size=mx.nextInt();
      System.out.println("Enter the array elements");
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=mx.nextInt();
        }
        maxEle(a,size);
      
    }
  }