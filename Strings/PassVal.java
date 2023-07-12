import java.util.Scanner;
class PassVal
  {
    public static void main(String args[])
    {
      
      Scanner pass=new Scanner(System.in);
      int up=0,lc=0,dg=0,sp=0,len=0;
      System.out.println("Enter the password");
      String passs=pass.next();
      int length=passs.length();
      for(int i=0;i<passs.length();i++)
        {
          char ch=passs.charAt(i);
         if(ch>'a' && ch<'z')
          {
            up++;
          }
          if(ch>'A' && ch<'Z')
          {
            lc++;
          }
         if(ch>'0' && ch<'9')
          {
            dg++;
          }
          if(length>=8)
          {
            len++;
          if((ch=='!')||(ch=='@')||(ch=='#')||(ch=='$')||(ch=='*')||(ch=='&')||(ch=='%')||(ch=='.'))
          {
            sp++;
          }
          }
        }
          if(up>0&&lc>0&&dg>0&&sp>0&&len>0)
          {
            System.out.println("Is a valid password");
          }
          else
          {
            System.out.println("In valid password");
          }
        
    }
  }