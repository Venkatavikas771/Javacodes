import java.util.Scanner;
class StringRev
  {
    public static void main(String args[])
    {
      Scanner reverse=new Scanner(System.in);
      String s1[]={"mom","sir","Dad","Madam","Teacher"};
           
       for(int i=0;i<s1.length;i++)
        {
           String rev="";
          String temp=s1[i];
           for(int j=temp.length()-1;j>=0;j--)
             {
            rev=rev+temp.charAt(j);
            }
           
        if(temp.equalsIgnoreCase(rev))
      {
        System.out.println(temp);
      }
     
            
    }
  }
  }