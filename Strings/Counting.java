class Counting
  {
    public static void main(String args[])
    {
      int letters=0;
      int digits=0;
      int spl=0;
     String st="vikaskur@3456";
      int count=0;
      for(int i=0;i<st.length();i++)
        {
           char in=st.charAt(i);
          if((in>'a') && (in<'z')||(in>'A') && (in<'Z'))
          {
             letters++;
          }
         else if((in>'0') && (in<'9'))
          {
             digits++;
          }
          else if((in=='@')||(in=='%')||(in=='*')||(in=='#')||(in=='^')||(in=='!'))
          {
             spl++;
          }
          else
          {
             System.out.println("Enter valid input");
          }
          
        }

      
          System.out.println("Number of characters are :"+letters); 
       System.out.println("Number of characters are :"+digits); 
       System.out.println("Number of characters are :"+spl); 
        
      
      
    }
  }