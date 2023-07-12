import java.util.Scanner;
class TwoDArray
  {
    public static void main(String args[])
    {
      Scanner add=new Scanner(System.in);
      System.out.println("Enter the size of row");
      int row=add.nextInt();
       System.out.println("Enter the size of coloumn");
      int col=add.nextInt();
      int a[][]=new int[row][col];
      System.out.println("Enter the array elements");
      for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
             {
             a[i][j]=add.nextInt();
             }
        }
       for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
             {
              System.out.print("The matrix form is :"+a[i][j]+" ");
             }
           System.out.println();
        }
      
    }
  }
