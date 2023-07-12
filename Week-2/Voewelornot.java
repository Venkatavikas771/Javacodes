import java.util.Scanner;
class Voewelornot
  {
public static void main(String args[])
    {
      
      Scanner vikas=new Scanner(System.in);
      System.out.println("enter character");
      char ch=vikas.next().charAt(0);
      if ((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
      {
      System.out.println("Is a vowel");  
      }
      else 
      {
      System.out.print("Not a vowel");
      }
      
    }
  }  