import java.util.Scanner;
class MaxLen
  {
    public static void main(String args[])
    {
      Scanner len=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=len.nextLine();
      String split[]=st.split(" ");
      int max=split[0].length();
      String str="";
      for(int i=0;i<split.length;i++)
        {
        int lent=split[i].length();
      if(max>lent)
      {
        max=lent;
        str=split[i];
      }
    }
      System.out.println("Max length word is:"+str+"Length is:"+max);
    }
  }