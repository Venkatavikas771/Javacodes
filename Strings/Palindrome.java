import java.util.Scanner;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner palin=new Scanner(System.in);
      System.out.println("Enter the string to check palindrome or not");
       String st=palin.next();
      String rev="";                              //Empty string
      for(int i=st.length()-1;i>=0;i--)
        {
          rev=rev+st.charAt(i);
        }
      System.out.println("Reverse string is :"+rev);
      if(st.equals(rev))
      {
         System.out.println("Is A PALINDROME");
      }
      else
      {
         System.out.println("Is A PALINDROME");
      }
    }
  }