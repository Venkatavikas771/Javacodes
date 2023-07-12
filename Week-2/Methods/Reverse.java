import java.util.Scanner;
class Reverse
  {
    public static void reverseArray(int a[],int size)
    {
       for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
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
          reverseArray(a,size);
      }
  }
