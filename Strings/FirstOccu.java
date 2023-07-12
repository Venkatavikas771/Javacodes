import java.util.Scanner;
class FirstOccu
  {
    public static void main(String ags[])
    {
      Scanner occ=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=occ.nextLine();
      System.out.println("Enter the character want to get index");
      char ch=occ.next().charAt(0);
      /* System.out.println(st.indexOf(ch));  */

       int i;
      for(i=0;i<st.length();i++)
        {
          if(st.charAt(i)==ch)
          {
            break;
          }
        }
      System.out.println(i);


      
      
    }
  }