import java.util.Scanner;
class TextAnalyzer
  {
    public static void main(String args[])
    {
      Scanner text=new Scanner(System.in);
      System.out.println("Enter the text");
      String st=text.nextLine();
      String str[]=st.split(" ");
      String wrd;
      int wordcount=0;
      for(int i=0;i<str.length;i++)
        {
         wrd=str[i];
          wordcount++;
        }
       System.out.println("The word count of text :"+(wordcount));
      int charcount=0;
      for(int i=0;i<st.length();i++)
        {
          st.charAt(i);
          charcount++;
        }
       System.out.println("Enter the total characters :"+charcount);
    }
  }