import java.util.Scanner;

/*1.Write a Java program that takes three numbers from the user and prints the greatest number.

 

Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87*/
import java.util.Scanner;
class Greater
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the 1st number");
      int a=sc.nextInt();
       System.out.println("Enter the 2nt number");
      int b=sc.nextInt();
       System.out.println("Enter the 3rt number");
      int c=sc.nextInt();
      if(a>b && a>c)
      {
         System.out.println("The greatest :"+a);
      }
      else if(b>a && b>c)
      {
         System.out.println("The greatest :"+b);
      }
      else
      {
        System.out.println("The greatest :"+c);
      }
    }
  }