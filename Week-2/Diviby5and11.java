import java.util.Scanner;
class Diviby5and11
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("provide  number");
      int a=vikas.nextInt();
      if(a%5==0 && a%11==0 )
      {
      System.out.println("Is divisible by 5 and 11");  
      }
      else 
      {
      System.out.print("Is not divisible by 5 and 11");
      }
      
    }
  }  