import java.util.Scanner;
class Student
  {
    public static void studentGrades(String stuname,int higd)
    {
      int grade=higd[0];
      String stuname=stuname[0];
      for(int i=0;i<st.length;i++)
        {
          if(st[i]>higd)
          {
            higd=st[i];
            stuname=str1[i];
          }
        }
    System.out.println(higd+" "+stuname);
    }
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the names");
      String stunames=vikas.next();
     System.out.println("Enter the grades of respective students");
      int higd=vikas.nextInt();
     studentGrades(stuname,higd);
    }
  }
