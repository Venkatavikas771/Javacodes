class NumOfWords
  {
    public static void main(String args[])
    {
      
     String st="Welcome to internship program";
      String split[]=st.split(" ");
      int count=0;
      for(int i=0;i<split.length;i++)
        {
          count++;
        }

       System.out.println("Number of words are :"+count); 
        }
  }