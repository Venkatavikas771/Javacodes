import java.util.Scanner;
class PeriOfSqu
{
  public static void periOfSqu(int side)
  {
       int peri=(4*side);
    
           System.out.println("perimeter of aquare is ;"+peri);
         }
         
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the side");
      int side=vikas.nextInt();
      periOfSqu(side);
     }
  }