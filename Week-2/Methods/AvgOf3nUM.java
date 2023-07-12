import java.util.Scanner;
class AvgOf3nUM
{
  public static void avgOfThreeNumbers(int num1,int num2,int num3)
    {
      int avg=(num1+num2+num3)/3;
      System.out.println("The result is "+avg);
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the first number");
      int num1=vikas.nextInt();
      System.out.println("Enter the second number");
      int num2=vikas.nextInt();
      System.out.println("Enter the third number");
      int num3=vikas.nextInt();
      AvgOfThreeNumbers(num1,num2,num3);
      
     }
  }
