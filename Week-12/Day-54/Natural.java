/*Write a Java program to display n terms of natural numbers and their sum.

 

Test Data
Input the number: 2
Expected Output :

 

Input number:                                                                    
2                                                                                
The first n natural numbers are :                                                
2                                                                                
1                                                                                
2                                                                                
The Sum of Natural Number upto n terms :                                         
23*/

import java.util.Scanner;
class Natural
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the range to print the numbers");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<=n;i++)
        {
          sum=sum+i;
        }
      System.out.println("The sum of these n numbers is :"+sum);
    }
  }