import java.util.Scanner;
class EncrytDecrypt
  {
    public static void enc(String st)
    {
      int inc=0;
     char chen;
     String eminc="";
      char ch[]=st.toCharArray();
      for(int i=0;i<ch.length;i++)
        {
        inc= ch[i]+1; 
        chen=(char)inc;
        eminc=eminc+chen;
        }
    
      System.out.println("The encrypt string id :"+eminc);
    }
      public static void decryption(String st)
    {
      int decr=0;
      char chde;
      String emdec="";
      String str=eminc;
      char ch1[]=str.toCharArray();
      for(int i=0;i<ch1.length;i++)
        {
          decr=ch1[i]-1;
          chde=(char)decr;
          emdec=emdec+chde;
        }
      System.out.println("The decrypt string is :"+emdec);
    }
        
    public static void main(String args[])
    {
      Scanner endee=new Scanner(System.in);
      System.out.println("Enter the string");
      String st=endee.next();
      enc(st);
      decryption(st);
    }
  }





/*import java.util.Scanner;
public class Main
{
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       char ch[]=str.toCharArray();
       int Ascii=0;
       char temp;
       String encrypted="";
       for(int i=0;i<ch.length;i++)
       {
           Ascii=ch[i]+1;
           temp=(char)Ascii;
           encrypted=encrypted+temp;
       }
       System.out.println(encrypted);
        
        }
}*/