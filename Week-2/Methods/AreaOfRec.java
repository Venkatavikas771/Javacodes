import java.util.Scanner;
class AreaOfRec
{
  public static void areaofRectangle(int length,int breadth)
  {
       int area=(length*breadth);
    
           System.out.println("Area is ;"+area);
         }
         
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the length");
      int length=vikas.nextInt();
      System.out.println("Enter the time in breadth");
      int breadth=vikas.nextInt();
      areaofRectangle(length,breadth);
     }
  }