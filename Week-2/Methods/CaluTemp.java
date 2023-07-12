import java.util.Scanner;
class CaluTemp
{
  public static void temperature(int a)
    {
       if((a>=0) && (ch=='c')||(ch=='C'))
      {
      System.out.println("The temperature in celsius is :"+((a-32)*5/9));
      }
      else if((a>=0) && (ch=='f')||(ch=='F'))
      {
      System.out.print("The temperature in fahrenheit is :"+(a*1.8)+32);
      }
      else  
      {
      System.out.print("ENTER VALID TEMPERATURE");
      }
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("ENTER TEMPERATURE");
      int a=vikas.nextInt();
      System.out.println("Wants temperature in celsius ENTER (c OR C) or farenheit ENTER (F OR f)");
      char ch=vikas.next().charAt(0);
      temperature(a);
     }
  }