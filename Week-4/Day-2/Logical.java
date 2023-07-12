import java.util.Scanner;
class Logical
  {
    public static void main(String args[])
    {
      Scanner amount=new Scanner(System.in);
      System.out.println("Enter the amount");
      int a=amount.nextInt();
      if(a%100==0)
      {
        System.out.println("valid amount");
      }
      else{
        System.out.println("Invalid amount");
      }
        
    }
  }