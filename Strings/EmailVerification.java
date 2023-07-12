import java.util.Scanner;
class EmailVerification
  {
    public static void main(String args[])
    {
      
      Scanner em=new Scanner(System.in);
      int letters=0,sp1=0,sp2=0;
      System.out.println("Enter the email");
      String email=em.next();
      for(int i=0;i<email.length();i++)
        {
          char ch=email.charAt(i);

          if(ch>'a' && ch<'z')
          {
            letters++;
          }
  
         if(ch=='@' )
          {
            sp1++;
          }
          if(ch=='.')
          {
            sp2++;
          }
        
      }
          if(letters>0&&sp1>0&&sp2>0)
          {
            System.out.println("Is a valid email");
          }
          else
          {
            System.out.println("In valid email check again");
          }
        
    }
  }