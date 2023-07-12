import java.util.Scanner;
class PrintMenu
  {
    public static void menuPrint(int a[],int size,int menu)
    {
      int sum=0;
      if(menu==1)
      {
        for(int i=0;i<a.length;i++)
          {
            sum=sum+a[i];
          }
         System.out.println("The sum is ;"+sum);
        }
     
      
      else if(menu==2)
        
      {
         int max=a[0];
        for(int i=0;i<a.length;i++)
          
          {
            if(max<a[i])
            {
              max=a[i];
            }
          }
        System.out.println("Max elenment is :"+max);
      }
      
      
       else if(menu==3)
      {
        int min=a[0];
        for(int i=0;i<a.length;i++)
          
          {
            if(min>a[i])
            {
              min=a[i];
            }
          }
         System.out.println("Min elenment is :"+min);
      }
     
     else if (menu==4)
      {
        for(int i=0;i<a.length;i++)
          {
          int cut=0;
          for(int j=1;j<=a[i];j++)
            {
              if(a[i]%j==0)
              {
                cut++;
              }
            }
         if(cut==2)
         {
           System.out.println(a[i]+"Is a prime");
         }
         
            }
          }
      else if(menu==5)
      {
        for(int i=a.length-1;i>=0;i--)
          {
          System.out.println("Reverse elements are :"+a[i]);  
          }
      }
      else{
        System.out.println("Invalid choice");
      }
      
      }
        public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
       System.out.println("Enter the array size");
        int size=vikas.nextInt();
      System.out.println("Enter your choice");
      System.out.println("Enter 1 for sum of array");
      System.out.println("Enter 2 for max element in array");
      System.out.println("Enter 3 for min element in array");
      System.out.println("Enter 4 for prime numbers in array");
      System.out.println("Enter 5 for reverse an element");
        int menu=vikas.nextInt();
       System.out.println("Enter your array elements");
        int a[]=new int[size];
      int i;
      for( i=0;i<a.length;i++)
      {
        a[i]=vikas.nextInt();
      }
    
      
        menuPrint(a,size,menu);  
      
    
                        
    }
    }
  
  