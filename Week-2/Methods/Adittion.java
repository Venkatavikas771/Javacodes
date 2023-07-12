import java.util.Scanner;
class Adittion
{
  public static void additionOfThreeNum(int a,int b,int c)
    {
        System.out.println("addition of three numbers");
        System.out.println("addition is :"+(a+b+c));
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the a value");
      int a=vikas.nextInt();
      System.out.println("Enter the b value");
      int b=vikas.nextInt();
      System.out.println("Enter the c value");
      int c=vikas.nextInt();
      additionOfThreeNum(a,b,c);
      
     }
  }