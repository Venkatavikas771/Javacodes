import java.util.Scanner;
class FreqOfSt
  {
    public static void main(String args[])
    {
      Scanner fre=new Scanner (System.in);
      System.out.println("Enter the string");
      String st=fre.next();
      int size=st.length();
      char ch[]=st.toCharArray();
      boolean b[]=new boolean[ch.length];
      for(int k=0;k<b.length;k++)
        {
          b[k]=false;
        }

       for(int i=0;i<ch.length;i++)
         {
           int count=1;
           if(b[i]=true)
           {
             continue;
           }
           for(int j=i+1;j<ch.length;j++)
             {
               if(ch[i]==ch[j])
               {
                 count++;
                 b[j]=true;
               }
             }
            System.out.println("Frequency"+ch[i]+"--------"+count);
         }
          

      
      
    }
  }