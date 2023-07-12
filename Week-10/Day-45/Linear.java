import java.util.Scanner;
class LinearSearch
  {
    public static void linSearch(int ar[],int size,int key) 
    {
      for(int i=0;i<ar.length;i++)
        {
          if(ar[i]==key)
          {
            System.out.println("The element found at index position :"+i);
            break;
          }
          else
          {
            System.out.println("Element not there");
          }
        }
    }
  }
    class Linear
      {
        public static void main(String args[])
        {
          LinearSearch l=new LinearSearch();
          Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter the size");
          int size=sc.nextInt();
          System.out.println("Enter the key to search");
          int key=sc.nextInt();
          System.out.println("Enter the array values");
            int ar[]=new int[size];
          for (int k=0;k<ar.length;k++)
            {
              ar[k]=sc.nextInt();
            }
          l.linSearch(ar,size,key); 
        }
      }
  