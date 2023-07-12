import java.util.Scanner;
class Menu
{
  public static void emailValidator(String email)
  {
    for(int i=0;i<email.length()-1;i++)
      {
        int dot=0,symbol=0;
        char ch=email.charAt(i);
        if(ch=='@' )
        {
          symbol++;
        }
        if(ch=='.')
        {
          dot++;
        }
      
        if(symbol>0 && dot>0)
        {
          System.out.println("Is a valid email");
        }
    else
    {
      System.out.println("Invalid email");
    }
    }
  }
      
     public static void passwordVerification(String password)
  {
    int upper=0,lower=0,digit=0,specialchar=0;
    for(int i=0;i<password.length()-1;i++)
      {
        char ch=password.charAt(i);
        if(ch>='a'  && ch<='z')
        {
          lower++;
       }
        if(ch>='A'  &&  ch<='Z')
        {
          upper++;
        }
      
    if(ch>='0' &&ch<='9')
    {
      digit++;
    }
    if((ch=='@')||(ch=='#') ||(ch=='$') ||(ch=='*') ||(ch=='&') ||(ch=='%'))
    {
      specialchar++;
    }
  }
    if(upper>0&&lower>0&&digit>0&&specialchar>0)
    {
      System.out.println("Is a valid password");
      
    }
    else{
      System.out.println("Is a invalid password");
    }
  }

  
  public static void mobileNumberVerification(String mobno)
  {
    for(int i=0;i<mobno.length()-1;i++)
      {
    char ch=mobno.charAt(i);
    if(mobno.length()==10) 
    {
      if((ch=='6')||(ch=='7')||(ch=='8')||(ch=='9'))
      {
        System.out.println("Is a valid mobie number");
      }
      else
      {
        System.out.println("In valid mobie number");
      }
    }
    else 
    {
       System.out.println("In valid mobie number enter less than ten numbers");
    }
  }
  }

    
  
  public static void main(String args[])
  {
    Scanner menu=new Scanner (System.in);
    System.out.println("Choose the option to perform validations");
    System.out.println("Choose 1 for email verification");
    System.out.println("Choose 2 for password verification");
    System.out.println("choose 3 for mobile number validation");
    char choose=menu.next().charAt(0);
    switch(choose)
      {
        case 1:
          System.out.println("Enter the email");
            String email=menu.next();
           emailValidator(email);
          break;
          case 2:
          System.out.println("Enter the password");
            String password=menu.nextLine();
           passwordVerification(password);
          break;
          case 3:
          System.out.println("Enter the mobile number");
            String mobno=menu.nextLine();
           mobileNumberVerification(mobno);
          break;
        default:
          System.out.println("Enter the valid input");
             
      }
  }
}