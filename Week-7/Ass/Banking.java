import java.util.Scanner;
class InsufficientFundException extends Exception
  {
    InsufficientFundException(String msg)
    {
      super(msg);
    }
  }
    class Banking
      {
   public static void main(String args[])
    {
      try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the balance");
        int a=sc.nextInt();
        System.out.println("Enter the withdraw balance");
        int b=sc.nextInt();
         System.out.println("Enter the money to deposit");
        float c=sc.nextInt();
        
        if(b>a)
        {
          throw new InsufficientFundException("Insufficient balance");
        }
          else{
            System.out.println("Eligible to withdraw");
          }
      }
        catch(InsufficientFundException e)
        {
          System.out.println("Exception caught :"+e.getMessage());
        }
      }
    }
  

