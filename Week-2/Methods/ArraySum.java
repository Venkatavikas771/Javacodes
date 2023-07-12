import java.util.Scanner;
class ArraySum
  {
    public static void arraySum(int a[],int size)
    {
      int count=0;
      
    for(int i=0;i<a.length;i++)
        {
          count=count+a[i];
        }
  
      System.out.println("The sum is :"+count);
    
  
      
  }
  
  
      public static void main(String args[]) 
        {
        Scanner vikas=new Scanner(System.in);
        System.out.println("Enter the string size");
        int size=vikas.nextInt();
        System.out.println("Enter the array elements");
          int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
          a[i]=vikas.nextInt();
        }
          arraySum(a,size);
            
          
        }
  }
