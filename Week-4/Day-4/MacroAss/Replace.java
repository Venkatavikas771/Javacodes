import java.util.Scanner;
class Replace
  {
    public static void main(String args[])
    {
      Scanner rep=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=rep.nextLine();
      System.out.println("Enter the string to be replaced");
      String st1=rep.next();
      System.out.println("Enter the string to be replaced newly");
      String st2=rep.next();
      System.out.println("The new string after replacement is :"+st.replace(st1, st2));
    }
  }
  