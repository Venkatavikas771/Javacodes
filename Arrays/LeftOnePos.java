
class LeftOnePos
  {
    public static void main(String args[])
    {
      int a[]={1,2,3,4,5,6};
      System.out.println("Array before shifting ");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a[i]);
        }
      int temp=a[0];
      for(int i=0;i<a.length-1;i++)
        {
          a[i]=a[i+1];
        }
        a[a.length-1]=temp;
      System.out.println("after perfroming left roatation by 1 position ");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }