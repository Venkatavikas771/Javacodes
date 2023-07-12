class PrintUnq
  {
    public static void main(String args[])
    {
      int a[]={1,2,5,8,2,9,7,2,5};
      int size=a.length;
      boolean b[]=new boolean[size];
      for(int k=0;k<size;k++)
        {
          b[k]=false;
        }
    System.out.println("Unique elements are");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(b[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                b[j]=true;
              }
            }
            if(count==1)
          System.out.println(a[i]);
        }
    }
  }