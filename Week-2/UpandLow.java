  import java.util.Scanner;
class UpandLow
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("enter character");
      char ch=vikas.next().charAt(0);
      if (ch>='a' && ch<='z')
      {
      System.out.println("Is a lowercase letter");  
      }
      else if(ch>='A' && ch<='Z')
      {
      System.out.print("is a upper case");
      }
      else
      {
      System.out.print("ENTER SINGLE CHARACTER");
      }
    } 
    }