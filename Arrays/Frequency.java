import java.util.Scanner;
class Frequency
  {
    public static void main(String args[])
    {
      Scanner vikas=new Scanner(System.in);
      System.out.println("Enter the size");
       int size= vikas.nextInt();
      int a[]=new int[size];
      for(int i=0;i<a.length;i++)
        {
          a[i]=vikas.nextInt();
        }
      boolean b[]=new boolean[size];          //false array F F F F F F F F ..........
      for(int k=0;k<b.length;k++)
        {
          b[k]=false;
        }
      
      System.out.println("frequenct elements are");
      System.out.println("Element -----------Frequency");
      for(int i=0;i<b.length;i++)
        {
          int count=1;                    //EVERY ELEMENT REPEATED ONE TIME ATLEAST
          if(b[i]==true)             //IF b[i]=true n false matrix it skips without checking with j because already checked.
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;    //false array lo unna same number position ni true chestundi so  malli same element ni check 
              }
            }
          
          System.out.println(a[i]+"------------"+count);
        }
    }
  }