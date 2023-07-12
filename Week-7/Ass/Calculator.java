import java.util.Scanner;

/*Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.*/
class InvalidExpressionException extends Exception
  {
    InvalidExpressionException(String S)
    {
      super(S);
    }
  }
class  Calculator
{
  public static void main(String args[])
  {
    try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the a value");
      int a=sc.nextInt();
      System.out.println("Enter the b value");
      int b=sc.nextInt();
       System.out.println("Enter the c value for division (Dividend)");
      int c=sc.nextInt();
      System.out.println("Enter the c value for division (Divisor)");
      int d=sc.nextInt();
       if((a>=0 && a<=9) &&(b>=0 && c<=9) &&(c>=0 && c<=9) &&(d>0 && d<=9))
       {
       System.out.println("Adittion is :"+(a+b));
       System.out.println("suntraction is :"+(a-b));
       System.out.println("Multiplication is :"+(a*b));
       System.out.println("division is :"+(a/b));
       }
      else{
        throw new InvalidExpressionException("Exception caught :Invalid input") ;
      }
  }
    catch(InvalidExpressionException e){
      System.out.println(e.getMessage());
    }
  }
}