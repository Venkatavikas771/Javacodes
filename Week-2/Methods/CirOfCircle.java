import java.util.Scanner;
class CirOfCircle
{
  public static void circumOfCircle(int r)
    {
     System.out.println("circumference of circle");
      System.out.println("circumference of circle :"+(2*3.14*r))
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the radius");
      int r=vikas.nextInt();
      circumOfCircle(r);
     }
  }
