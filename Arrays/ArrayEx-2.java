class Array3
  {
    public static void main(String args[])
    {
              
      Scanner sc=new Scanner(System.in);
      int a[]=new int[5]; 
      System.out.println("enter the array elements");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt(); //a[0]=34 //a[1]=45
        }
      
      System.out.println("array elements are");
      for(int i=0;i<5;i++)
        {
          System.out.println(a[i]+" ");
        }
      
    }
  }