class SplitWordsRev
  
  {
    public static void main(String args[])
    {
      String st="My name is vikas";
       String sp[]=st.split(" ");
         for(int i=sp.length-1;i>=0;i--)
           {
             System.out.println(sp[i]);
           
           }
       
      }
  }