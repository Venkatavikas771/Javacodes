class CountVow
  {
    public static void main(String args[])
    {
      int vowel=0;
      int consonant=0;
      
     String st="vikaskuraganti";
  
      for(int i=0;i<st.length();i++)
        {
           char ch=st.charAt(i);
          if(((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')))
          {
             vowel++;
          }
         else 
          {
            consonant++;
          }
      }

       System.out.println("Number of vowels are :"+vowel); 
       System.out.println("Number of consonant are :"+consonant); 
     }
  }