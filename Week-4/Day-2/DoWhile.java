import java.util.Scanner;
class DoWhile
  {
    public static void main(String args[])
    {
      Scanner dw=new Scanner(System.in);
     do
     {
       System.out.println("Enter the amount");
       int a=dw.nextInt();
       if(a%100==0)
       {
         System.out.println("Is avalid amount");
         break;
       }
     else
       {
        System.out.println("In avalid amount enter valid amount");
      }
     }
       
     while(true);
       
       }
  }
  