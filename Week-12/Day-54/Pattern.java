/*Write a Java program to display the pattern like a right angle triangle with a number.

 

Test Data
Input number of rows : 10
Expected Output :

 

1                                                                                
12                                                                               
123                                                                              
1234                                                                             
12345                                                                            
123456                                                                           
1234567                                                                          
12345678                                                                         
123456789                                                                        
12345678910*/

import java.util.Scanner;
class Pattern
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the rows to print");
      int a=sc.nextInt();
      for(int i=1;i<a;i++)
        {
          for(int j=1;j<=i;j++)
            {
           System.out.print(j);
             
        }
           System.out.println(""); 
    }
  }
  }