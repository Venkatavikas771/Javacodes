import java.util.Scanner;
class ReverseWords
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the string");
        String str=vikas.nextLine();
      String split[]=str.split(" ");
      String rev="";
      for(int i=split.length-1;i>=0;i++)
        {
          rev=rev+split[i];
        }
      System.out.println(rev+" ");
    }
  }