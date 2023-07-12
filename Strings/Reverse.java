import java.util.Scanner;
class Reverse{
  public static void main(String args[])
 {
    Scanner rev=new Scanner(System.in);
    System.out.println("Enter the string");
    String st=rev.next();
    String reverse="";
    for(int i=st.length()-1;i>=0;i++)
      {
        reverse=reverse+st.charAt(i);
      }
     System.out.println(reverse);
        
      
 }                      
    
                         
}