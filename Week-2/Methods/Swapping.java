import java.util.Scanner;
class Swapping
{
  public static void swappingOfTwoNum(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
      System.out.println("The result after swapping is "+a+","+b);
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the first number");
      int a=vikas.nextInt();
      System.out.println("Enter the second number");
      int b=vikas.nextInt();
      swappingOfTwoNum(a,b);
      
     }
  }