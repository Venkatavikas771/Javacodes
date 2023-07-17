//Write a Java program to sum values of an array
class ArraySum
  {
    public static void main(String args[])
    {
      int a[]={1,3,4,5,6,2,8};
      int sum=0;
      for(int i=0;i<a.length;i++)
        {
          sum=sum+a[i];
        }
      System.out.println("The sum of all elements in array are :"+sum);
  }