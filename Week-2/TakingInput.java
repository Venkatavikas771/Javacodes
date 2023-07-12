import java.util.Scanner;
class TakingInput
  {
public static void main(String args[])
    {
      int a,b,c;
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide first number");
      a=vikas.nextInt();
      System.out.println("provide second number");
      b=vikas.nextInt();
      System.out.println("provide third number");
      c=vikas.nextInt();
      System.out.println("addition of three numbers is");
      System.out.println("addition is :"+(a+b+c));
    }
        
  }